package lesson10.task10;

public class ShapeDemo {
    public static void main(String[] args) {
            Shape[] figures = new Shape[2];
            figures[0] = new Circle("черный", 5,2);
            figures[1] = new Rectanglee("красный", 1, 8);

            for (Shape figure : figures) {
                figure.draw();
                System.out.println();
            }
        }
    }
