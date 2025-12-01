package by.lessons.task_19_20;

import java.util.List;
import java.util.concurrent.*;

public class MainNumber {
    public static void main(String[] args) {

        List<Integer> number1 = List.of(2, 5, 6, 8);
        List<Integer> number2 = List.of(3, 9, 14, 2);
        List<Integer> number3 = List.of(7, 16, 63, 3);
        List<Integer> number4 = List.of(1, 6, 48, 32);

        NumberGenerator numberGenerator1 = new NumberGenerator(number1, "first");
        NumberGenerator numberGenerator2 = new NumberGenerator(number2, "second");
        NumberGenerator numberGenerator3 = new NumberGenerator(number3, "third");
        NumberGenerator numberGenerator4 = new NumberGenerator(number4, "forth");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(numberGenerator3);
        Future<String> future2 = executorService.submit(numberGenerator2);
        Future<String> future3 = executorService.submit(numberGenerator4);
        Future<String> future4 = executorService.submit(numberGenerator1);

//        try {
//            future1.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
    }
}