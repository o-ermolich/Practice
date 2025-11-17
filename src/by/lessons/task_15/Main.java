package by.lessons.task_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> table = new HashMap<>();

        table.put(0, "Athena");
        table.put(1, "George");
        table.put(2, "John");
        table.put(3, "Michael");
        table.put(4, "Ariana");
        table.put(5, "Mia");

        Set<Integer> keys = table.keySet();
        int j = 1;

        for (Integer i : keys) {
            if (i > 3) {
                System.out.println(table.get(i));
            }
            if (i == 0) {
                System.out.println(table.values());
            }
            String val = table.get(i);
            if (val.length() > 5) {
                j = i * j;
            }
        }
        System.out.println(j);
    }
}
