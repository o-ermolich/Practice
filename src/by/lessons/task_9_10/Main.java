package by.lessons.task_9_10;

public class Main {

    public static void main(String[] args) {
        Fabric fabric1 = new Fabric("Пенькова", "цемент", 1987, "строительство", 1500, "цементные блоки");
        Fabric fabric2 = new Fabric("Одинцова", "бетон", 2000, "строительство", 2300, "стены");
        Building fabric3 = new Fabric("Ленина", "бумага", 2001, "бумажная", 1700,"тетради");

        System.out.println(fabric3.info());
        Village villages = new Village();
        villages.addBuilding(fabric1);
        villages.addBuilding(fabric2);
        villages.addBuilding(fabric3);

        villages.info();
    }
}
