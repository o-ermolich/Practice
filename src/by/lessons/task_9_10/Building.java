package by.lessons.task_9_10;

public class Building {
    private String street;
    private String material;
    private int year;

    public Building (String street, String material, int year) {
        this.street = street;
        this.material = material;
        this.year = year;
    }

    public String info() {
        String info = " улица: " + street + " материал: " + material + " год: " + year;
        return info;
    }
}
