package by.lessons.task_17.serial;

import java.io.Serializable;

public class Farm implements Serializable {
    private String owner;
    private int animalsCount;
    private String city;

    public Farm(String owner, int animalsCount, String city) {
        this.owner = owner;
        this.animalsCount = animalsCount;
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }

    public void setAnimalsCount(int animalsCount) {
        this.animalsCount = animalsCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        Farm farm = (Farm) o;
        return (owner.equals(farm.getOwner()) && animalsCount == farm.animalsCount && city.equals(farm.getCity()));
    }

    public int hashCode() {
        int result = owner.hashCode() + animalsCount + city.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Farm {" +
                "владелец: '" + owner + '\'' +
                ", количество животных: " + animalsCount +
                ", город: '" + city + '\'' +
                '}';
    }
}
