package by.lessons.task_5_6;

public class Task_5_6_Main {
    public static void main(String[] args) {
        //Задание 1
        int i;

        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("**************************************");

        //Задание 2

        int a;
        for (a = 1; a <= 512; a *= 2) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("**************************************");

        //Задание 3

        int b = 1;
        int sum = 0;
        while (b <= 10) {
            sum += b;
            b++;
        }
        System.out.println(sum);

        System.out.println("**************************************");

        //Задание 4

        int c = 100;
        do {
            System.out.print(c + ", ");
            c--;
        }
        while (c > 1);
        System.out.println("1");

        System.out.println("**************************************");

        //Задание 5

        int d = 1;
        while (d <= 100) {
            System.out.print(d + " ");
            d++;
        }
        System.out.println();
        System.out.println("**************************************");

        //Задание 6

        int f;
        for (f = 1; f <= 100; f++) {
            if (f % 2 == 1)
                System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("**************************************");

        //Задание 7

        int g;
        for (g = 1; g <= 100; g++) {
            if (g % 10 == 0)
                System.out.print(g + " ");
        }
        System.out.println();
        System.out.println("**************************************");

        //Задание 8

        int[] array = {5, 7, 4, 2, 8, -3, 5, 6, 77, 2, 1, 9};
        int max = array[0];
        int min = array[0];

        for (int value : array) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
        System.out.println("**************************************");

        //Задание 9

        int[] numbers = new int[100];
        int k, m = 1;

        for (k = 0; k < 100; k++) {
            numbers[k] = m;
            m++;
            System.out.print(numbers[k] + " ");
        }
    }
}



