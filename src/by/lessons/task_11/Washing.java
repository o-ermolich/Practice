package by.lessons.task_11;

public class Washing implements Device {
    private String name;
    private String brand;
    private int price;
    private boolean isOn;

    public void work() {
        System.out.println("Стиральная машина "+name+" стирает");
    }

    public Washing(String name, String brand, int price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }
}
