package by.lessons.task_19_20;

public class Main {
    public static void main(String[] args) {


        Multi multi = (int a, int b) -> {
            return a * b;
        };

        int resNumber = multi.multiplication(5, 10);
        System.out.println(resNumber);

        hello(multi,14,7);

        Multi divide = (int a, int b) -> {
            return a / b;
        };

        int resDivide = divide.multiplication(5, 10);
        System.out.println(resDivide);

        Multi add = (int a, int b) -> {
            System.out.println(a + "; " + b);
        return a + b;
        };

        int resSum = add.multiplication(5,10);
        System.out.println(resSum);
    }

    private static void hello(Multi multi, int a, int b) {
        multi.multiplication(a,b);
    }
}

