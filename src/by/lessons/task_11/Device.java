package by.lessons.task_11;

public interface Device {
    void work();

    default void start() {
        System.out.println("электроприбор стартует");
    }
}

