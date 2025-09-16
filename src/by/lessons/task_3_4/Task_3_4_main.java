package by.lessons.task_3_4;

import java.util.Scanner;

public class Task_3_4_main {
    public static void main(String[] args) {
        //уравнение (10+12)*x=88
        double x;
        x = 88/(10+12);
        System.out.println(x);

//        Scanner in=new Scanner(System.in);
//        System.out.println("Введите x");
//        int x1=in.nextInt();
//        System.out.println("Введите y");
//        int y=in.nextInt();
//        System.out.println("Введите z");
//        int z =in.nextInt();
//
//        x1+=y;
//        y*=z;
//        System.out.println(x1 + " "+y);

        System.out.println("----------------------");
        //уравнение 213/x+258/x+60=217
        x = (213+258)/(217-60);
        System.out.println(x);
        System.out.println("----------------------");
        int a=5;
        int b=2;
        int c;

        c = a++ * b--;

        System.out.println(c + " "+ a + " " +b);

        System.out.println("----------------------");
//        int res;
//
//        Scanner in=new Scanner(System.in);
//      System.out.println("Введите a");
//        int a1=in.nextInt();
//        System.out.println("Введите b");
//        int b1=in.nextInt();
//
//      if (a1>b1)
//         res = a1-b1;
//     else if (a1==b1)
//          res = a1+b1;
//     else
//          res = b1-a1;
//
//     System.out.println("Результат вычисления: "+ res);
//
//     System.out.println("----------------------");

//        double res1;
//
//        Scanner in=new Scanner(System.in);
//      System.out.println("Введите a");
//        int a2=in.nextInt();
//        System.out.println("Введите b");
//        int b2=in.nextInt();
//
//      if (a2>b2 & b2!=0)
//          res1 = a2/b2;
//     else if (a2!=0)
//          res1 = b2/a2;
//     else
//          res1 = a2+b2;
//
//     System.out.println("Результат вычисления: "+ res1);


        Scanner in=new Scanner(System.in);
      System.out.println("Введите число");
        int three=in.nextInt();

        if (three%3 == 0)
            System.out.println("Число делится на три");
        else System.out.println("Число не кратно трём");
    }
}
