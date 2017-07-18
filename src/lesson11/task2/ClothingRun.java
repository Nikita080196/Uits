package lesson11.task2;

public class ClothingRun {
    public static void main(String[] args) {
        Clothing[] good = new Clothing[4];
        good[0] = new Tie(Sizes.M, 100, "Черный");
        good[1] = new T_short(Sizes.M, 200, "Зеленая");
        good[2] = new Trouses(Sizes.L, 150, "Белые");
        good[3] = new Skirt(Sizes.S, 320, "Черная");

        Studio studio = new Studio();
        studio.dressMan(good);
        System.out.println();
        studio.dressWoman(good);
    }
}