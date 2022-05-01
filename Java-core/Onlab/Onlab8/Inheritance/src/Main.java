public class Main {
    public static void main(String[] args) {
//        Student s = new Student(1,"nova", 13031994,"cntt",9);
//        System.out.println(s);
//
//        Teacher t = new Teacher(2, "ngoc", 1996, "JS", 8000000);
//        System.out.println(t);
        Library l = new Library(1, "Harry Potter", "kim dong", 2000, 4);
        System.out.println(l);
        SchoolBook b = new SchoolBook(2, "wolf", "kimdong", 2000, 7, 300, "new", 5);
        System.out.println(b);
        System.out.println("so luong ton kho = " + b.tonkho(b.getSoluong(),b.getSoluongmuon()));
        Caculator.sum(6,6);
        Caculator.sum(7,8,9);
        Caculator.sum(5.4, 7.5);
    }
}
