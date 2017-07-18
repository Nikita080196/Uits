package lesson11.task2;

public class Studio {
    public void dressMan(Clothing[] clothings) {
        System.out.println("Мужская одежжда");
        for (Clothing clothe : clothings) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
                ((MenClothing) clothe).dressMan();
            }
        }
    }

    public void dressWoman(Clothing[] clothings) {
        System.out.println("Женская одежда");
        for (Clothing clothe : clothings) {
            if (clothe instanceof WomanClothing) {
                System.out.println(clothe);
                ((WomanClothing) clothe).dressWoman();
            }
        }
    }
}