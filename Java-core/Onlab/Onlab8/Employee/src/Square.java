public class Square extends Geometry {
    public int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return Math.pow(edge,2);
    }

    @Override
    public double perimeter() {
        return edge*4;
    }
}
