package lesson8.task5;

public class Circle {
    private double radius;
    private static final double Pi = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleLength() {
        return 2 * Pi * radius;
    }

    public double getCircleSquare() {
        return Math.pow(radius, 2) * Pi;
    }

    public double getRadius() {
        return radius;
    }
}