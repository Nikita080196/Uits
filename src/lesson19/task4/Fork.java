package lesson19.task4;
public class Fork{
private Phil philosof;

public synchronized void takeFork(Phil philosof) {
        while (this.philosof != null) {
        try {
        wait();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }
        this.philosof = philosof;
        }

public synchronized void dropFork() {
        this.philosof = null;
        notify();
        }
        }

