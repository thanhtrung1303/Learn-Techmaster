package controller;

import model.Role;
import model.Student;
import model.Teacher;
import model.User;
import service.StudentService;
import service.TeacherService;
import service.UserService;
import util.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static UserService userService = new UserService();
    static ArrayList<User> listUser = userService.getAllUser();
    static StudentService studentService = new StudentService();
    static ArrayList<Student> listStudent = studentService.getAllStudent();
    static TeacherService teacherService = new TeacherService();
    static ArrayList<Teacher> listTeacher = teacherService.getAllTeacher();

    public static void signInOrSignUp() {
        System.out.println("1 - Đăng nhập ");
        System.out.println("2 - Đăng ký");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> userService.Login();
            case 2 -> userService.createNewAccountByUser();
            default -> {
            }
        }
    }

    public static void loginSucceed(String username) {
        User user = userService.getAccountByUsername(username);
        if (user.getRole() == Role.Admin) {
            System.out.println("Chào mừng Quản trị viên");
            adminLogin();
        } else if (user.getRole() == Role.Teacher) {
            Teacher choseTeacher = teacherService.checkTeacher(username);
            System.out.println("Chào mừng Giáo viên " + choseTeacher.getName());

            teacherLogin(choseTeacher);
        } else {
            System.out.println("Chào mừng Người dùng " + username);
            userLogin();
        }
    }

    public static void userLogin() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuUser();
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> searchStudentInfomation();
                case 2 -> searchTeacherInfomation();
                case 3 -> schoolReport();
                case 4 -> signInOrSignUp();
                case 0 -> {
                    System.out.println("Hẹn gặp lại!!!");
                    System.exit(0);
                }
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void teacherLogin(Teacher teacher) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuTeacher();
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> teacher.showTeacherInfomation();
                case 2 -> {
                    Student student = teacherService.choseStudent(teacher);
                    teacherService.updatePoint(student, teacher);
                }
                case 3 -> {
                    System.out.println("Kết quả học tập lớp dạy: ");
                    studentService.showStudentByTeachClass(listStudent, teacher);
                }
                case 4 -> {
                    System.out.println("Kết quả học tập lớp Chủ Nhiệm " + teacher.getMainClass());
                    studentService.showByClass(listStudent, teacher.getMainClass());
                }
                case 5 -> studentService.show(listStudent);
                case 6 -> searchStudentInfomation();
                case 7 -> searchTeacherInfomation();
                case 8 -> schoolReport();
                case 9 -> signInOrSignUp();
                case 0 -> {
                    System.out.println("Hẹn gặp lại!!!");
                    System.exit(0);
                }
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void adminLogin() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuAdmin();
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> addNewPerson();

                case 2 -> userService.createNewAccountByAdmin();


                case 3 -> {
                    System.out.println("Nhập username của tài khoản: ");
                    String username = sc.nextLine();
                    User user = userService.getAccountByUsername(username);
                    System.out.println(user);
                    userService.delete(user);

                }
                case 4 -> updateTeacher();

                case 5 -> updateStudent();
                case 6 -> changeStaff();

                case 7 -> schoolReport();
                case 8 -> signInOrSignUp();
                case 0 -> {
                    System.out.println("Hẹn gặp lại!!!");
                    System.exit(0);
                }
                default -> System.out.println("Không có lựa chọn này");

            }
        }
    }

    public static void searchStudentInfomation() {
        Menu.subMenuUser();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Nhập tên học sinh muốn tìm: ");
                String searchName = sc.nextLine();
                studentService.searchByName(listStudent, searchName);
            }
            case 2 -> {
                System.out.println("Nhập mã học sinh muốn tìm: ");
                String searchID = sc.nextLine();
                studentService.searchById(listStudent, searchID);
            }
            case 3 -> {
                System.out.println("Nhập tên lớp bạn muốn tìm kiếm: ");
                String searchClass = sc.nextLine();
                studentService.showByClass(listStudent, searchClass);
            }
            case 0 -> userLogin();
        }
    }

    public static void searchTeacherInfomation() {
        Menu.subMenuUser();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Nhập tên giáo viên muốn tìm: ");
                String searchName = sc.nextLine();
                teacherService.searchByName(listTeacher, searchName);
            }
            case 2 -> {
                System.out.println("Nhập mã giáo viên muốn tìm: ");
                String searchID = sc.nextLine();
                teacherService.searchById(listTeacher, searchID);
            }
            case 3 -> {
                System.out.println("Nhập tên lớp mà giáo viên chủ nhiệm: ");
                String searchClass = sc.nextLine();
                teacherService.searchByMainClass(listTeacher, searchClass);
            }
            case 0 -> userLogin();
        }
    }

    public static void schoolReport() {
        Menu.menuReport();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> listStudent.forEach(Student::showStudentInfomation);
            case 2 -> studentService.softByPoint(listStudent);
            case 3 -> {
                studentService.getHighestStudent(listStudent);
                studentService.getHighestInGrade(listStudent, 10);
                studentService.getHighestInGrade(listStudent, 11);
                studentService.getHighestInGrade(listStudent, 12);
            }
            case 4 -> studentService.countByRate(listStudent);
            case 5 -> teacherService.getHighestSeniority();
            case 0 -> userLogin();
        }
    }

    public static void addNewPerson() {
        Menu.menuCreate();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                Student newStudent = studentService.createNewStudent();
                studentService.addNewStudent(newStudent, listStudent);
                System.out.println("Danh sách học sinh sau khi thêm: ");
                studentService.show(listStudent);

            }
            case 2 -> {
                Teacher newTeacher = teacherService.createNewTeacher();
                teacherService.addNewTeacher(newTeacher, listTeacher);
                System.out.println("Danh sách giáo viên sau khi thêm: ");
                studentService.show(listTeacher);
            }
            case 0 -> adminLogin();

        }
    }

    public static void changeStaff() {
        System.out.println("1 - Đổi giáo viên chủ nhiệm");
        System.out.println("0 - Về menu chính");
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Nhập id giáo viên bạn muốn tìm");
                String searchIDTeacher = sc.nextLine();
                Teacher teacher = teacherService.searchById(listTeacher, searchIDTeacher);
                teacherService.changeChairMan(teacher);
            }
            case 0 -> adminLogin();
        }
    }

    public static void updateTeacher() {
        System.out.println("Nhập ID giáo viên bạn muốn tìm");
        String searchIDTeacher = sc.nextLine();
        Teacher teacher = teacherService.searchById(listTeacher, searchIDTeacher);
        Menu.menuSearchTeacher();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> teacherService.delete(listTeacher, teacher);
            case 2 -> teacherService.updateTeacherInfomation(teacher);
            case 0 -> adminLogin();
        }
    }

    public static void updateStudent() {
        System.out.println("Nhập ID học sinh bạn muốn tìm");
        String searchIDStudent = sc.nextLine();
        Student student = studentService.searchById(listStudent, searchIDStudent);
        Menu.menuSearchStudent();
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> studentService.delete(listStudent, student);
            case 2 -> studentService.updateStudentInfomation(student);
            case 0 -> adminLogin();
        }

    }
}