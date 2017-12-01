package lesson8.task4;

abstract class Flower {
    private String country;
    private int date;
    public static int count;

    public Flower(String country, int date) {
        this.country = country;
        this.date = date;
        count++;
    }

    public String getCountry() {
        return country;
    }

    public int getDate() {
        return date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDate(int date) {
        this.date = date;
    }

    abstract public int price();

    public static int costOfBouquet(Flower... flowers) {
        int sum = 0;
        for (Flower f : flowers) {
            sum += f.price();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (date != flower.date) return false;
        return country != null ? country.equals(flower.country) : flower.country == null;
    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + date;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "Country='" + country + '\'' +
                ", date=" + date +
                '}';
    }
}