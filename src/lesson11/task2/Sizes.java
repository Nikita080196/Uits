package lesson11.task2;

public enum Sizes {
    XXS(32) {
        public void getDescription() {
            System.out.println("Детский размер.");
        }
    }, XS(34), S(38), M(41), L(44);
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void getDescription() {
        System.out.println("Взрослый размер.");
    }
}