package lesson10.task10;

public class Rectanglee extends Shape {
    private int x1;
    private int y1;

    public Rectanglee(String color, int x1, int y1) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void draw() {
        System.out.println("Рисуетсч " + getColor() + " прямоугольник");
        System.out.println("С координатами : x = " + x1 + " , y = "+ y1);
    }
}
