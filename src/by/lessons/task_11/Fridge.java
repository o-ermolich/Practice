package by.lessons.task_11;

public class Fridge implements Device, KitchenDevice {

    private String name;
    private String model;
    private int price;
    private boolean isOn;

    public void work() {
        System.out.println("Холодильник "+name+" морозит");
    }

    public Fridge(String name, String model, int price, boolean isOn) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void broken() {
        System.out.println("Холодильник ломается");
    }
}
