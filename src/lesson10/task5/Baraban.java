package lesson10.task5;

public class Baraban implements Tools {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Ьарабан.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Baraban baraban = (Baraban) o;

        return size != null ? size.equals(baraban.size) : baraban.size == null;
    }

    @Override
    public int hashCode() {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "size='" + size + '\'' +
                '}';
    }
}