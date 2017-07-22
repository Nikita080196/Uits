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
        System.out.println("С координатами : x = " + x1 + " , y = " + y1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectanglee rectanglee = (Rectanglee) o;

        if (x1 != rectanglee.x1) return false;
        return y1 == rectanglee.y1;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + getColor() +
                ", x = " + x1 +
                ", y = " + y1 +
                '}';
    }
}

