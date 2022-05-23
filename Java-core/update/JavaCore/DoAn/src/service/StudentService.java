package service;

import exception.MyException;
import model.Student;
import model.Teacher;
import util.Validate;

import java.util.*;

public class StudentService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> listStudent = getAllStudent();

    /*Tạo mảng thông tin học sinh*/
    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("HS001", "Nguyễn Đức Nam", 10, "10A1", 2006, "Hoàn Kiếm", 9.5, 7.0, 8.0));
        list.add(new Student("HS002", "Trần Thuý Quỳnh", 10, "10A1", 2006, "Hà Đông", 8.5, 8.0, 8.0));
        list.add(new Student("HS003", "Phan Văn Tài", 10, "10A1", 2006, "Hai Bà Trưng", 9, 6.0, 7.0));
        list.add(new Student("HS004", "Phan Huy Tùng", 10, "10A2", 2006, "Thanh Xuân", 9, 6.5, 9.0));
        list.add(new Student("HS005", "Đoàn Quỳnh Chi", 10, "10A2", 2006, "Hoàng Mai", 9.5, 9, 9.0));
        list.add(new Student("HS006", "Trần Thuỳ Linh", 10, "10A2", 2005, "Hoàn Kiếm", 7.5, 7.0, 8.0));
        list.add(new Student("HS007", "Nguyễn Văn Đức", 10, "10A3", 2006, "Ba Đình", 6.5, 5.0, 5.0));
        list.add(new Student("HS008", "Hoàng Quang Trung", 10, "10A3", 2006, "Long Biên", 4.5, 7.0, 4.0));
        list.add(new Student("HS009", "Nguyễn Hoài Nam", 10, "10A3", 2006, "Hai Bà Trưng", 5.5, 6.0, 4.5));
        list.add(new Student("HS010", "Phan Văn Vinh", 11, "11A1", 2005, "Hoàn Kiếm", 10, 9.0, 9.5));
        list.add(new Student("HS011", "Thái Quang Đạt", 11, "11A1", 2005, "Thanh Xuân", 9, 8.0, 10));
        list.add(new Student("HS012", "Nguyễn Thị Thu Thuỷ", 11, "11A1", 2005, "Hoàn Kiếm", 8.5, 9.5, 9.0));
        list.add(new Student("HS013", "Nguyễn Quang Sang", 11, "11A2", 2005, "Hoàng Mai", 7.5, 7.0, 8.0));
        list.add(new Student("HS014", "Nguyễn Thị Nga", 11, "11A2", 2005, "Thanh Xuân", 8.5, 7.5, 8.5));
        list.add(new Student("HS015", "Nguyễn Trung Đức", 11, "11A2", 2005, "Hoàng Mai", 6.5, 5.0, 6.0));
        list.add(new Student("HS016", "Lưu Quang Vinh", 11, "11A3", 2005, "Hoàn Kiếm", 5.5, 3.0, 5.0));
        list.add(new Student("HS017", "Phan Minh Tuyết", 11, "11A3", 2005, "Hoàn Kiếm", 4.5, 5.0, 4.0));
        list.add(new Student("HS018", "Đặng Văn Lâm", 11, "11A3", 2005, "Ba Đình", 6.5, 7.0, 5));
        list.add(new Student("HS019", "Nghiêm Cẩm Thuỳ", 12, "12A1", 2004, "Đống Đa", 9.75, 7., 7.0));
        list.add(new Student("HS020", "Nguyễn Văn Quân", 12, "12A1", 2004, "Hoàn Kiếm", 9.5, 9.0, 9.0));
        list.add(new Student("HS021", "Trần Minh Hiếu", 12, "12A1", 2004, "Tây Hồ", 8.5, 9.0, 10.0));
        list.add(new Student("HS022", "Phan Thu Thảo", 12, "12A2", 2004, "Hoàn Kiếm", 7.5, 7.0, 7.0));
        list.add(new Student("HS023", "Nguyễn Hoàng Nam", 12, "12A2", 2004, "Thanh Xuân", 6.5, 8.0, 6.0));
        list.add(new Student("HS024", "Phan Hoàng Yến", 12, "12A2", 2004, "Long Biên", 8.25, 8.0, 8.0));
        list.add(new Student("HS025", "Nguyễn Hoàng Trung", 12, "12A3", 2004, "Hoàn Kiếm", 6.75, 6.0, 4.0));
        list.add(new Student("HS026", "Nguyễn Thuý Diễm", 12, "12A3", 2004, "Hà Đông", 8.5, 8.0, 2.0));
        list.add(new Student("HS027", "Nguyễn Hằng Nga", 12, "12A3", 2004, "Hoàn Kiếm", 5.5, 5.0, 4.0));


        return list;
    }

    /*In danh sách ra*/
    public void show(ArrayList<?> list) {
        for (Object student : list
        ) {
            System.out.println(student);
        }
    }

    /*Tím học sinh theo mã */
    public Student searchById(ArrayList<Student> list, String searchIdStudent) {
        int count = 0;
        for (Student s : list
        ) {
            if (s.getIdStudent().equals(searchIdStudent)) {
                s.showStudentInfomation();
                count++;
                return s;
            }
        }
        if (count == 0) {
            System.out.println("Không có học sinh này!!");
        }
        return null;
    }

    /*Tìm học sinh theo tên*/
    public void searchByName(ArrayList<Student> list, String searchName) {
        list.stream().filter(student -> student.getName().toLowerCase().contains(searchName.toLowerCase()))
                .forEach(Student::showStudentInfomation);
    }

    /*Tạo học sinh mới*/
    public Student createNewStudent() {

        System.out.println("Nhập mã học sinh: ");
        String idStudent = inputIDStudent("HS");
        System.out.println("Nhập tên học sinh : ");
        String name = sc.nextLine();
        System.out.println("Nhập khối: ");
        int grade = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên lớp ");
        String schoolClass = inputSchoolClass(grade);
        System.out.println("Nhập năm sinh: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        return new Student(idStudent, name, grade, schoolClass, year, address);
    }


    /*Thêm học sinh mới vào danh sách*/
    public void addNewStudent(Student student, ArrayList<Student> list) {
        list.add(student);
        System.out.println("Thêm học sinh thành công");
    }

    /*Thêm ID và Validate ID*/
    public String inputIDStudent(String keyWord) {
        boolean check = true;
        String id = "#####";
        while (check) {
            id = sc.nextLine();

            try {
                Validate.validateID(id, keyWord);
                if (checkIDStudent(listStudent, id)) {
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

    /*Nhập tên lớp*/
    public String inputSchoolClass(int grade) {
        boolean check = true;
        String schoolClass = "##";
        while (check) {
            schoolClass = sc.nextLine();

            try {
                Validate.validateClass(schoolClass, grade);
                check = false;

            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            }
        }
        return schoolClass;
    }

    /* Tìm xem ID đã có chưa*/
    public boolean checkIDStudent(ArrayList<Student> list, String id) {
        for (Student c : list
        ) {
            if (c.getIdStudent().equals(id)) {
                return false;
            }
        }
        return true;
    }

    /*Sắp xếp theo điểm từ cao xuống thấp*/
    public void softByPoint(ArrayList<Student> list) {

        list.stream().sorted((o1, o2) -> o2.getAveragePoint() - o1.getAveragePoint() > 0 ? 1 : -1).forEach(Student::showStudentInfomation);
    }

    /*Tìm học sinh thủ khoa toàn trường và thủ khoa các khối*/
    public void getHighestStudent(ArrayList<Student> list) {
        System.out.println("Thủ khoa toàn trường là: ");
        list.stream().sorted((o1, o2) -> o2.getAveragePoint() - o1.getAveragePoint() > 0 ? 1 : -1).limit(1).forEach(Student::showStudentInfomation);
    }

    public void getHighestInGrade(ArrayList<Student> list, int grade) {
        System.out.println("Thủ khoa khối " + grade + " là:");
        list.stream().filter(student -> student.getGrade() == grade)
                .sorted((o1, o2) -> o2.getAveragePoint() - o1.getAveragePoint() > 0 ? 1 : -1).limit(1)
                .forEach(Student::showStudentInfomation);
    }

    /*Sửa thông tin học sinh*/
    public void updateStudentInfomation(Student student) {

        System.out.println("Nhập tên học sinh : ");
        student.setName(sc.nextLine());
        System.out.println("Nhập khối: ");
        student.setGrade(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tên lớp ");
        student.setSchoolClass(sc.nextLine());
        System.out.println("Nhập năm sinh: ");
        student.setYear(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập địa chỉ: ");
        student.setAddress(sc.nextLine());

    }

    /*Xem danh sách theo lớp*/
    public void showByClass(ArrayList<Student> list, String searchClass) {
        list.stream().filter(student -> student.getSchoolClass().equalsIgnoreCase(searchClass))
                .forEach(Student::showStudentInfomation);
    }

    public void showStudentByTeachClass(ArrayList<Student> list, Teacher teacher) {
        for (String s : teacher.getTeachClass()
        ) {
            System.out.println("Kết quả học tập lớp " + s);
            for (Student student : list
            ) {
                if (student.getSchoolClass().equals(s)) {
                    student.showStudentInfomation();
                }

            }
        }
    }

    /*Xoá học sinh*/
    public void delete(ArrayList<Student> list, Student student) {

        list.remove(student);
        System.out.println("Danh sách sau khi xoá: ");
        show(list);
    }

    /*Thống kê kết quả học tập toàn trường*/
    public void countByRate(ArrayList<Student> list) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (Student s : list
        ) {
            count++;
            if (map.get(s.getRate()) == null) {
                map.put(s.getRate(), 1);
            } else {
                map.put(s.getRate(), map.get(s.getRate()) + 1);
            }
        }
        System.out.println("Thống kê học sinh toàn trường theo xếp loại:");
        System.out.println("Toàn trường " + count + " học sinh: " + map);

    }
}
