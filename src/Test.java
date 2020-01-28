public class Test {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(8,6);
        Triangle triangle = new Triangle(9,4,6);
        Circle circle = new Circle(7);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("- Area of square is " + shapeCalculator.squareArea(square) + " cm^2");
        System.out.println("- Area of circle is " + shapeCalculator.circleArea(circle) + " cm^2");
        System.out.println("- Perimeter of triangle is " + shapeCalculator.trianglePerimeter(triangle) + " cm");
        System.out.println("- Perimeter of rectangle is " + shapeCalculator.rectPerimeter(rectangle) + " cm");

    }
}

