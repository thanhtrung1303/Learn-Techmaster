import controller.Controller;
import model.Student;
import service.StudentService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Controller.signInOrSignUp();
        StudentService studentService=new StudentService();
        ArrayList<Student>list= studentService.getAllStudent();
        list.forEach(System.out::println);
    }
}
