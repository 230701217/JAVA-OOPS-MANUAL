// Input	
// 1
// 4
// 5
// 6
// 4

// Result
// Area of a circle: 50.27
// Area of a Rectangle: 30.00
// Area of a Triangle: 6.00
//Code
import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        double rectangleLength = scanner.nextDouble();
        double rectangleBreadth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleBreadth);

        double triangleBase = scanner.nextDouble();
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        System.out.printf("Area of a circle: %.2f%n", circle.calculateArea());
        System.out.printf("Area of a Rectangle: %.2f%n", rectangle.calculateArea());
        System.out.printf("Area of a Triangle: %.2f%n", triangle.calculateArea());

        scanner.close();
    }
}
