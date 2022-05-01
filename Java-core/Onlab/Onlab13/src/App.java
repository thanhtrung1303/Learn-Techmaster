import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "abc", 8));
        students.add(new Student(2, "ac", 7));
        students.add(new Student(3, "ab", 6));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "ann", 500));
        teachers.add(new Teacher(2, "ano", 200));
        teachers.add(new Teacher(3, "anna", 300));

    }
}
