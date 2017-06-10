package lesson7.task4.com.company.details;

public class Engine {
    private String producer;
    private int power;

    public Engine(String producer, int power) {
        this.setProducer(producer);
        this.setPower(power);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}