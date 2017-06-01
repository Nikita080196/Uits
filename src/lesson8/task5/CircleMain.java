package lesson8.task5;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle(30);

        System.out.println("Радиус первого круга равен : " + circle1.getRadius());
        System.out.println("Длинна первого круга равна : " + circle1.getCircleLength());
        System.out.println("Площадь первого круга равна : " + circle1.getCircleSquare());
        System.out.println();
        System.out.println("Радиус второго круга равен : " + circle2.getRadius());
        System.out.println("Длинна второго круга равна : " + circle2.getCircleLength());
        System.out.println("Площадь второго круга равна : " + circle2.getCircleSquare());
        System.out.println();
        System.out.println("Радиус первого круга равен : " + circle3.getRadius());
        System.out.println("Длинна третьего круга равна : " + circle3.getCircleLength());
        System.out.println("Площадь третьего круга равна : " + circle3.getCircleSquare());
    }
}