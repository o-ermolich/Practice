package by.lessons.task_17.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        relativePath();
        absolutePath();
        readRelativePath();
        readAbsolutePath();
    }

    private static void relativePath() {
        File file = new File("src\\text2.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка записи");
        }
    }

    private static void absolutePath() {
        File file = new File("C:\\Users\\User\\IdeaProjects\\GitProjects", "practice.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка записи");
        }
    }

    private static void readRelativePath() {
        File file = new File("src\\text2.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка чтения");
        }
    }

    private static void readAbsolutePath() {
        File file = new File("C:\\Users\\User\\IdeaProjects\\GitProjects", "practice.txt");
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка чтения");
        }
    }
}
