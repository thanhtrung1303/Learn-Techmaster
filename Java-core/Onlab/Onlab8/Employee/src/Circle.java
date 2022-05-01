public class Circle extends Geometry {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
