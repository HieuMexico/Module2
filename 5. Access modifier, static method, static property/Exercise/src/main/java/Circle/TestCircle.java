package Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        Circle circle1 = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
