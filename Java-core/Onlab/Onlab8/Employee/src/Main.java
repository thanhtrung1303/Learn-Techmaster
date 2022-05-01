import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer(1, "john", LocalDate.of(1996, 10, 8), 5000000, 20);
        System.out.println(d);
        Tester t = new Tester(2, "anna", LocalDate.of(1998, 5, 16), 4000000, 30);
        System.out.println(t);

        Circle c = new Circle(3);
        System.out.println("dien tich hinh tron: " + c.area());
        System.out.println("chu vi hinh tron: " + c.perimeter());

        rectangle rec = new rectangle(3,4);
        System.out.println("dien tich hinh chu nhat: " + rec.area());
        System.out.println("chu vi hinh chu nhat: " + rec.perimeter());

        Square sq = new Square(5);
        System.out.println("dien tich hinh vuong: " + sq.area());
        System.out.println("chu vi hinh vuong: " + sq.perimeter());
    }
}
