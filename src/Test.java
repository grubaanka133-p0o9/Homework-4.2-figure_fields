public class Test {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(8,6);
        Triangle triangle = new Triangle(9,4,6);
        Circle circle = new Circle(7);
        double squareArea = square.squareArea(square);
        double rectPerimeter = rectangle.rectPerimeter(rectangle);
        double trianglePerimeter = triangle.trianglePerimeter(triangle);
        double circleArea = circle.circleArea(circle);

        System.out.println("- Area of square is " + squareArea + " cm^2");
        System.out.println("- Perimeter of triangle is " + trianglePerimeter + " cm");
        System.out.println("- Perimeter of rectangle is " + rectPerimeter + " cm");
        System.out.println("- Area of circle is " + circleArea + " cm^2");
    }
}

