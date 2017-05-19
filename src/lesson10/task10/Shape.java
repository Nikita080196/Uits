package lesson10.task10;

abstract class Shape {
    private int x;
    private int y;
    private String color;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    abstract public float draw();
}