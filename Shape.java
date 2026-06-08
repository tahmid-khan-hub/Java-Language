public abstract class Shape {
    String color;

    public abstract double area();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}
