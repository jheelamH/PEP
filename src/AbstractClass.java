abstract class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        shape.display();
        System.out.println("The area of the shape is: " + shape.calculateArea());
    }
}
