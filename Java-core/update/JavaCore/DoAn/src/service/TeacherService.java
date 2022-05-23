package service;

import model.*;
import exception.MyException;
import util.Validate;

import java.util.ArrayList;

import java.util.Scanner;

public class TeacherService {
    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentService();
    ArrayList<Student> listStudent = studentService.getAllStudent();
    ArrayList<Teacher> listTeacher = getAllTeacher();

    /*Tạo mảng danh sách giáo viên*/
    public ArrayList<Teacher> getAllTeacher() {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("GV001", "Phan Thanh Hằng", 1984, "Hà Đông", Subject.Math, "10A1", new String[]{"10A1", "11A3", "10A2"}, 2006));
        list.add(new Teacher("GV002", "Nguyễn Thu Thuỷ", 1980, "Ba Đình", Subject.Math, "12A1", new String[]{"12A1", "12A2", "10A3"}, 2004));
        list.add(new Teacher("GV003", "Trần Văn Trường", 1977, "Thanh Xuân", Subject.Math, "11A1", new String[]{"11A1", "11A2", "12A3"}, 2000));
        list.add(new Teacher("GV004", "Phan Hồng Cẩm", 1988, "Hoàng Mai", Subject.Literature, "10A2", new String[]{"10A2", "12A2", "12A1"}, 2011));
        list.add(new Teacher("GV005", "Lê Như Mai", 1990, "Hà Đông", Subject.Literature, "11A3", new String[]{"10A1", "11A3", "12A3"}, 2013));
        list.add(new Teacher("GV006", "Đinh Thanh Huyền", 1983, "Long Biên", Subject.Literature, "11A2", new String[]{"10A3", "11A1", "11A2"}, 2006));
        list.add(new Teacher("GV007", "Phạm Thị Hoa", 1975, "Hà Tây", Subject.English, "12A3", new String[]{"10A2", "11A2", "12A3"}, 1999));
        list.add(new Teacher("GV008", "Phan Tú Quỳnh", 1991, "Hà Tĩnh", Subject.English, "12A2", new String[]{"10A1", "11A1", "12A2"}, 2014));
        list.add(new Teacher("GV009", "Hoàng Thanh Tú", 1995, "Hà Giang", Subject.English, "10A3", new String[]{"10A3", "11A3", "12A1"}, 2018));

        return list;
    }
/*Xoá khỏi danh sách*/
    public void delete(ArrayList<Teacher> list, Teacher teacher) {

        list.remove(teacher);
        System.out.println("Danh sách sau khi xoá: ");
        studentService.show(list);
    }
/*Tạo và thêm giáo viên*/
    public Teacher createNewTeacher() {

        System.out.println("Nhập mã giáo viên: ");
        String idTeacher = inputIDTeacher("GV");
        System.out.println("Nhập tên giáo viên : ");
        String name = sc.nextLine();
        System.out.println("Nhập năm sinh ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập môn dạy: ");
        Subject subject = inputSubject();
        System.out.println("Nhập năm bắt đầu dạy: ");
        int startYear = Integer.parseInt(sc.nextLine());

        return new Teacher(idTeacher, name, year, address, subject, startYear);
    }

    public void addNewTeacher(Teacher teacher, ArrayList<Teacher> list) {
        list.add(teacher);
        System.out.println("Thêm giáo viên thanh công");
    }
/*Nhập môn dạy*/
    public Subject inputSubject() {
        System.out.println("Chọn môn học mà giáo viên dạy");
        Subject subject = Subject.Literature;
        System.out.println("1 - Toán");
        System.out.println("2 - Tiếng Anh");
        System.out.println("3 - Ngữ Văn");
        System.out.println("Lựa chọn của bạn là:");
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> subject = Subject.Math;
            case 2 -> subject = Subject.English;
        }
        return subject;
    }
/*Thay đổi thông tin giáo viên*/
    public void updateTeacherInfomation(Teacher teacher) {


        System.out.println("Nhập tên giáo viên : ");
        teacher.setName(sc.nextLine());
        System.out.println("Nhập năm sinh ");
        teacher.setYear(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập địa chỉ: ");
        teacher.setAddress(sc.nextLine());
        System.out.println("Nhập môn dạy: ");
        teacher.setSubject(inputSubject());
        System.out.println("Nhập năm bắt đầu dạy: ");
        teacher.setYear(Integer.parseInt(sc.nextLine()));

        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(teacher);
    }

    /*Nhập ID*/
    public String inputIDTeacher(String keyWord) {
        boolean check = true;
        String id = "#####";
        while (check) {
            id = sc.nextLine();

            try {
                Validate.validateID(id, keyWord);
                if (checkIDTeacher(listTeacher, id)) {
                    check = false;
                } else {
                    System.out.println("ID đã tồn tại");
                }

            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            }


        }
        return id;
    }

    /* Tìm xem ID đã có chưa*/
    public boolean checkIDTeacher(ArrayList<Teacher> list, String id) {
        for (Teacher teacher : list
        ) {
            if (teacher.getIdTeacher().equals(id)) {
                return false;
            }
        }
        return true;
    }

    /*Kiểm tra giáo viên theo tên đăng nhập và mã Giáo viên*/
    public Teacher checkTeacher(String username) {
        for (Teacher teacher : listTeacher
        ) {
            if (teacher.getIdTeacher().equals(username)) {
                return teacher;
            }
        }
        return null;
    }

    /*Chọn lớp*/
    public void choseTeachClass(Teacher teacher) {
        System.out.println("Các lớp mà bạn dạy môn " + teacher.getSubject().getValue());
        for (String s : teacher.getTeachClass()
        ) {
            System.out.println(s);
        }
        System.out.println("Nhập lớp có học sinh bạn muốn sửa điểm");
        String teachClass = sc.nextLine();
        studentService.showByClass(listStudent, teachClass);

    }

    /*Chọn học sinh*/
    public Student choseStudent(Teacher teacher) {
        choseTeachClass(teacher);
        System.out.println("Nhập id học sinh muốn sửa điểm: ");
        String searchId = sc.nextLine();
        return studentService.searchById(listStudent, searchId);
    }

    /*Thay đổi điểm*/
    public void updatePoint(Student student, Teacher teacher) {
        System.out.println("Sửa điểm môn " + teacher.getSubject().getValue() + " của học sinh " + student.getName());
        System.out.println("Nhập điểm mới: ");
        double point = Double.parseDouble(sc.nextLine());
        if (teacher.getSubject() == Subject.Math) {
            student.setMathPoint(point);
        } else if (teacher.getSubject() == Subject.English) {
            student.setEnglishPoint(point);
        } else {
            student.setLiteraturePoint(point);
        }
        System.out.println("Điểm học sinh sau khi sửa: ");
        student.showStudentInfomation();
    }

    /*Tìm giáo viên có thâm niêm cao nhất*/
    public void getHighestSeniority() {
        System.out.println("Giáo viên có thâm niên cao nhất là: ");
        listTeacher.stream().sorted((o1, o2) -> o2.countSeniority() - o1.countSeniority()).limit(1)
                .forEach(System.out::println);
    }

    /*Tím giáo viên theo mã */
    public Teacher searchById(ArrayList<Teacher> list, String searchIdTeacher) {
        int count = 0;
        for (Teacher teacher : list
        ) {
            if (teacher.getIdTeacher().equals(searchIdTeacher)) {
                System.out.println(teacher);
                count++;
                return teacher;
            }
        }
        if (count == 0) {
            System.out.println("Không có giáo viên này!!");
        }
        return null;
    }

    /*Tìm giáo viên theo lớp chủ nhiệm*/
    public Teacher searchByMainClass(ArrayList<Teacher> list, String searchMainClass) {
        for (Teacher teacher : list
        ) {
            if (teacher.getMainClass().equals(searchMainClass)) {
                System.out.println(teacher);
                return teacher;

            }
        }
        return null;
    }

    /*Tìm theo tên*/
    public void searchByName(ArrayList<Teacher> list, String searchName) {
        list.stream().filter(teacher -> teacher.getName().toLowerCase().contains(searchName.toLowerCase()))
                .forEach(System.out::println);
    }

    /*Đổi giáo viên chủ nhiêm*/
    public void changeChairMan(Teacher teacher) {
        System.out.println("Giáo viên " + teacher.getName() + " đang chủ nhiệm lớp " + teacher.getMainClass());
        System.out.println("Chọn lớp muốn phân bổ: ");
        String SchoolClass = sc.nextLine();
        System.out.println("Trước khi thay đổi: ");
        System.out.println(teacher);
        Teacher teacher1 = searchByMainClass(listTeacher, SchoolClass);
        System.out.println(teacher1);
        String swap = teacher.getMainClass();
        teacher.setMainClass(SchoolClass);
        teacher1.setMainClass(swap);
        System.out.println("Sau khi thay đổi lớp chủ nhiệm: ");
        System.out.println(teacher);
        System.out.println(teacher1);

    }

}

