package by.lessons.task_17.serial;

import java.io.*;

public class MainSerial {
    public static void main(String[] args) {
        farmSerial();
        farmDeserial();
    }

    public static void farmSerial() {
        Farm farm1 = new Farm("Пивоваров", 12, "Дзержинск");
        Farm farm2 = new Farm("Доронина", 14, "Орша");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("farmSerial"))) {
            // FileOutputStream fos = new FileOutputStream("farmSerial");
            // ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(farm1);
            objectOutputStream.writeObject(farm2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void farmDeserial() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("farmSerial"));) {
            // FileInputStream fis = new FileInputStream("farmSerial");
            // ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            System.out.println(objectInputStream.readObject());
            System.out.println(objectInputStream.readObject());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


