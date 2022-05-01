public class Student extends Person {
    private double point;

    public Student(int id, String name, double point) {
        super(id, name);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + point;
    }
}
