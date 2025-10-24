package by.lessons.task_11;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Delongi", "Капучинатор", 800, false);
        Coffee coffee2 = new Coffee("Samsung", "Эспрессо", 400, false);

        Fridge fridge1 = new Fridge("Р2д2", "Витязь", 1200, false);
        Fridge fridge2 = new Fridge("М13", "Минск", 843, false);

        Washing washing1 = new Washing("IPO-17", "LG", 870, false);
        Washing washing2 = new Washing("Mart", "Indesit", 900, false);

        Cleaner cleaner1 = new Cleaner("CV36", "Dreame", 1500, false);
        Cleaner cleaner2 = new Cleaner("CV99-1", "Trouver", 970, false);

        Device[] exhibition = {coffee1, coffee2, fridge1, fridge2, cleaner1, cleaner2, washing1, washing2};
        for (Device e : exhibition) {
            e.work();
        }

        KitchenDevice[] kitchenexhibition = {coffee1, coffee2, fridge1, fridge2};
        for (KitchenDevice k : kitchenexhibition) {
            k.work();
            k.broken();
        }

        Coffee[] coffeeexhibition = {coffee1, coffee2};
        for (Coffee c : coffeeexhibition) {
            c.makeCapuccino();
        }

        coffee1.start();
        fridge2.start();
    }
}
