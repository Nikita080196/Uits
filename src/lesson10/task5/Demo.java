package lesson10.task5;

/**
 * Created by uitschool JV on 02.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Tools[] tools = {
                new Guitar(),
                new Baraban(),
                new Truba(),
        };
        for (Tools tool : tools) {
            tool.play();
        }
    }
}