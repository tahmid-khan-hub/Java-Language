public class Circle extends Shape {
    double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return 3.1416 * radius * radius;
    }
}
