package lesson10.task10;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        // shape[0] = new Rectanglee(3,4);
        //shape[1] = new Circle(3.2, 3.0)

        for (Shape shape1 : shape) {
            shape1.draw();
        }
    }
}