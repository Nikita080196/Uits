package lesson10.task10;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
         shape[0] = new Rectanglee();
         //shape[1] = new Circle();

        for (Shape shape1 : shape) {
            shape1.draw();
        }
    }
}