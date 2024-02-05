package OOPs;

// Abstract class
abstract class Shape {
    abstract double calculateArea(); // Abstract method (no implementation)

    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Abst {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.displayArea(); // Calls the calculateArea method in Circle
        rectangle.displayArea(); // Calls the calculateArea method in Rectangle
    }
}

