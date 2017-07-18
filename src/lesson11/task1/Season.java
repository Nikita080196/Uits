package lesson11.task1;

enum Season {
    WINTER(-3), SPRING(20), SUMMER(30) {
        public void getSeasonDescription() {
            System.out.println("Это теплое время года");
        }
    },AUTUMN(10);

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    private int temp;

    public void getSeasonDescription() {
        System.out.println("Это холодное время года");
    }
}