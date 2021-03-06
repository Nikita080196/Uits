package lesson3.task6;

public class Retype {
    public static void main(String[] args) {
        convertToByte();
        convertToShort();
        convertToChar();
        convertToInt();
        convertToLong();
        convertToFloat();
        convertToDouble();
    }

    private static void convertToByte() {
        short s = 45;
        char ch = 's';
        int i = 555;
        long aLong = 45672;
        float f = 56.3f;
        double d = 32.3;

        byte b2 = (byte) ch;
        byte b1 = (byte) s;
        byte b3 = (byte) i;
        byte b4 = (byte) aLong;
        byte b5 = (byte) f;
        byte b6 = (byte) d;

        System.out.println("Преобразования в byte:");
        System.out.println();
        System.out.println("До преобразования переменная типа char равна " + ch + ", после преобразования в byte: " + b2);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в byte: " + b1);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в byte: " + b3);
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в byte: " + b4);
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в byte: " + b5);
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в byte: " + b6);
    }

    private static void convertToShort() {
        byte b = 45;
        char ch = 's';
        int i = 555;
        long aLong = 45672;
        float f = 56.3f;
        double d = 32.3;

        short s1 = b;
        short s2 = (short) ch;
        short s3 = (short) i;
        short s4 = (short) aLong;
        short s5 = (short) f;
        short s6 = (short) d;

        System.out.println("Преобразования в short");
        System.out.println();
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в short: " + s1);
        System.out.println("До преобразования переменная типа char равна " + ch + ", после преобразования в short: " + s2);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в short: " + s3);
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в short: " + s4);
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в short: " + s5);
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в short: " + s6);
    }

    private static void convertToChar() {
        byte b = 45;
        short s = 90;
        int i = 555;
        long aLong = 45672;
        float f = 56.3f;
        double d = 32.3;

        char c1 = (char) b;
        char c2 = (char) s;
        char c3 = (char) i;
        char c4 = (char) aLong;
        char c5 = (char) f;
        char c6 = (char) d;

        System.out.println("Преобразования в char");
        System.out.println();
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в char: " + c1);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в char: " + c2);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в char: " + c3);
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в char: " + c4);
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в char: " + c5);
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в char: " + c6);
    }

    private static void convertToInt() {
        long aLong = 45672;
        float f = 56.3f;
        double d = 32.3;
        byte b = 45;
        short s = 90;
        char c = 's';

        int i4 = (int) aLong;
        int i5 = (int) f;
        int i6 = (int) d;
        int i1 = b;
        int i2 = s;
        int i3 = c;

        System.out.println("Преобразования в int");
        System.out.println();
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в int: " + i4);
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в int: " + i5);
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в int: " + i6);
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в int: " + i1);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в int: " + i2);
        System.out.println("До преобразования переменная типа char равна " + c + ", после преобразования в int: " + i3);
    }

    private static void convertToLong() {
        byte b = 45;
        short s = 90;
        char c = 's';
        int i = 45672;
        float f = 56.3f;
        double d = 32.3;

        long l5 = (long) f;
        long l6 = (long) d;
        long l1 = b;
        long l2 = s;
        long l3 = c;
        long l4 = i;

        System.out.println("Преобразования в long");
        System.out.println();
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в long: " + l5);
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в long: " + l6);
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в long: " + l1);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в long: " + l2);
        System.out.println("До преобразования переменная типа char равна " + c + ", после преобразования в long: " + l3);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в long: " + l4);
    }

    private static void convertToFloat() {
        byte b = 45;
        short s = 90;
        char c = 's';
        int i = 45672;
        long aLong = 5632452;
        double d = 32.3;

        float f6 = (float) d;
        float f1 = b;
        float f2 = s;
        float f3 = c;
        float f4 = i;
        float f5 = aLong;


        System.out.println("Преобразования во float");
        System.out.println();
        System.out.println("До преобразования переменная типа double равна " + d + ", после преобразования в long: " + f6);
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в long: " + f1);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в long: " + f2);
        System.out.println("До преобразования переменная типа char равна " + c + ", после преобразования в long: " + f3);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в long: " + f4);
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в long: " + f5);
    }

    private static void convertToDouble() {
        byte b = 45;
        short s = 90;
        char c = 's';
        int i = 45672;
        long aLong = 5632452;
        float f = 32.3f;

        double d1 = b;
        double d2 = s;
        double d3 = c;
        double d4 = i;
        double d5 = aLong;
        double d6 = f;

        System.out.println("Преобразования в double");
        System.out.println();
        System.out.println("До преобразования переменная типа byte равна " + b + ", после преобразования в long: " + d1);
        System.out.println("До преобразования переменная типа short равна " + s + ", после преобразования в long: " + d2);
        System.out.println("До преобразования переменная типа char равна " + c + ", после преобразования в long: " + d3);
        System.out.println("До преобразования переменная типа int равна " + i + ", после преобразования в long: " + d4);
        System.out.println("До преобразования переменная типа long равна " + aLong + ", после преобразования в long: " + d5);
        System.out.println("До преобразования переменная типа float равна " + f + ", после преобразования в long: " + d6);
    }
}