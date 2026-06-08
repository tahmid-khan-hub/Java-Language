public class Main {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Tahmid");
        std.setAge(22);
        
        System.out.println(std.getName());
        System.out.println(std.getAge());

        Circle c = new Circle(5, "Red");
        c.displayColor();
        System.out.println(c.area());
    }
}