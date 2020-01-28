public class Rectangle {
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double rectPerimeter(Rectangle rectangle) {
        return (rectangle.a + rectangle.b) * 2;
    }
}

