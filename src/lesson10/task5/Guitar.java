package lesson10.task5;

public class Guitar implements Tools {
    private int stringNumber;

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Гитараа");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return stringNumber == guitar.stringNumber;
    }

    @Override
    public int hashCode() {
        return stringNumber;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringNumber=" + stringNumber +
                '}';
    }
}
