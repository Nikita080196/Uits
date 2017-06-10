package lesson8.task5;

public class Circle {
    private double radius;
    private static final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleLength() {
        return 2 * PI * radius;
    }

    public double getCircleSquare() {
        return Math.pow(radius, 2) * PI;
    }

    public double getRadius() {
        return radius;
    }
}