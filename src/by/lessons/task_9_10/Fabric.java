package by.lessons.task_9_10;

public class Fabric extends IndustrialBuilding{
    private int workers;
    private String products;

    public Fabric (String street, String material, int year, String branch, int workers, String products) {
        super(street, material, year, branch);
        this.workers = workers;
        this.products = products;
    }

    public String info() {
        String info = "количество работников: " + workers + " продукция: " + products + super.info();
        return info;
    }
    }


