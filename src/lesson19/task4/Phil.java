package lesson19.task4;

public class Phil implements Runnable {
    private String name;
    private Fork fork1;
    private Fork fork2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phil(String name, Fork fork1, Fork fork2) {
        this.name = name;
        this.fork1 = fork1;
        this.fork2 = fork2;
    }


    public void think() {
        fork1.dropFork();
        fork2.dropFork();
        try {
            System.out.println(getName() + " кладет вилку ");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat() {
        fork1.takeFork(this);
        fork2.takeFork(this);
        try {
            System.out.println(getName() + " кушает ");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            eat();
            think();
        }
    }
}