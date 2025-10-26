package by.lessons.task_11;

public class Coffee implements Device, KitchenDevice {
    private String name;
    private String function;
    private int price;
    private boolean isOn;

    public void work() {
        System.out.println("Машина "+ name + " варит кофе");
    }

    public Coffee(String name, String function, int price, boolean isOn) {
        this.name = name;
        this.function = function;
        this.price = price;
        this.isOn = isOn;
    }

    public void makeCapuccino() {
        System.out.println("Кофемашина варит капучино");
    }

    @Override
    public void broken() {
        System.out.println("Кофемашина ломается");
    }

    @Override
    public void start() {
        isOn = true;
        System.out.println("Кофемашина включена: " + isOn);
    }
}
