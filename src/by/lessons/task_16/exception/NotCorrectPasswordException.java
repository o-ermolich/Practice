package by.lessons.task_16.exception;

public class NotCorrectPasswordException extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
