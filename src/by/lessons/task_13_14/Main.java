package by.lessons.task_13_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        List<String> words = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = "Как дела";
        String string3 = "Праздник";
        String string4 = "Суфле";
        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(words.contains("Конфета"));
        System.out.println(words.size());
    }

    public static void task2() {
       // List<String> purchases = List.of("Сахар", "Нутелла", "Молоко", "Печенье", "Кефир");
        List<String> purchases = new ArrayList<>();

        String purchase1 = "Печенье";
        String purchase2 = "Нутелла";
        String purchase3 = "Баранки";
        String purchase4 = "Кефир";
        String purchase5 = "Чай";

        purchases.add(purchase1);
        purchases.add(purchase2);
        purchases.add(purchase3);
        purchases.add(purchase4);
        purchases.add(purchase5);

        printList(purchases);

        purchases.remove("Кефир");
        printList(purchases);
    }

    private static void printList(List<String> purchases) {
        for (String purch : purchases) {
            System.out.println(purch);
        }
    }
    public static void task3() {
        Book book1 = new Book("Мизери", "С. Кинг");
        Book book2 = new Book("Химия смерти", "С. Кинг");
        Book book3 = new Book("Химия смерти", "С. Бекетт");
        Set<Book> books = new HashSet<>();
       // List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        //books.remove(book2);

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
