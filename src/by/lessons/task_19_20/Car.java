package by.lessons.task_19_20;

public class Car {
    private int id;
    private String brand;
    private int mileage;
    private int year;
    private int maxSpeed;
    private int price;

    public Car(int id, String brand, int mileage, int year, int maxSpeed, int price) {
        this.id = id;
        this.brand = brand;
        this.mileage = mileage;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
