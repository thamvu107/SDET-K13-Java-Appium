package src.lessons.lesson_13;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException() {
        super();
    }

    // Custom exception
    public DivideByZeroException(String message) {
        super(message);
    }
}
