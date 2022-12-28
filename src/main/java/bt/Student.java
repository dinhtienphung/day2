package bt;

public class Student {

    private Square square;
    private Triangle triangle;
    private Circle circle;

    public void setSquare(Square square) {
        this.square = square;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void Circle (String name , double circles) {
        circle.draw(name);
        System.out.println(+circles);
    }

    public void square (String name , double squares) {
        square.draw(name);
        System.out.println(+squares);
    }

    public void triangle (String name , double triangles) {
        triangle.draw(name);
        System.out.println(+triangles);
    }
}
