package lesson10.task5;

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