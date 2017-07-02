package lesson10.task5;

import javax.tools.Tool;

import static lesson10.task5.Tools.KEY;

/**
 * Created by uitschool JV on 02.07.2017.
 */
public class Guitar implements Tools {
    private int stringNumber;

    public void play() {
        System.out.println("Играет " + KEY + " Гитараа");

    }
}

