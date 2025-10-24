package by.lessons.task_11;

public class Cleaner implements Device{
    private String name;
    private String brand;
    private int price;
    private boolean isOn;

    public void work() {
        System.out.println("Пылесос "+name+" убирает");
    }

    public Cleaner(String name, String brand, int price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }
}
