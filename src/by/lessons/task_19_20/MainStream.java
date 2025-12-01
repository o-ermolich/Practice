package by.lessons.task_19_20;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainStream {
    public static void main(String[] args) {
        stream1();
    }

    public static void stream1() {
        Car car1 = new Car(1, "Audi", 200000, 2000, 350, 3000);
        Car car2 = new Car(2, "Skoda", 75000, 2002, 300, 2500);
        Car car3 = new Car(3, "Audi", 53000, 2016, 400, 2800);
        Car car4 = new Car(4, "Lexus", 69700, 2007, 250, 4000);
        Car car5 = new Car(5, "Subaru", 100030, 2001, 200, 3300);

        //пробег от 50000 до 100000
        List<Car> cars = List.of(car1, car2, car3, car4, car5);
        List<Car> list = cars.stream().filter(car -> {
            if (car.getMileage() > 50000 && car.getMileage() <= 100000) {
                return true;
            } else return false;
        }).toList();

        System.out.println(list);

        //найти самую быструю машину
        Optional<Car> resCars = cars.stream().max(Comparator.comparing(Car::getMaxSpeed));
        if (resCars.isPresent()) {
            System.out.println(resCars.get());
        }

        //получить неповторяющиеся значения марок авто
        List<String> brands = cars.stream().map(car -> {
            return car.getBrand();
        }).distinct().toList();
        System.out.println(brands);

        //найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Car carOne = cars.stream().filter(car -> {
            if (car.getBrand().equals("Audi") && car.getMaxSpeed() > 300) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFound("Машина не найдена"));
        System.out.println(carOne);
    }
}


