package src.lessons.lesson_13;

public class DivideByZeroUncheckedException extends RuntimeException{
    public DivideByZeroUncheckedException() {
        super();
    }

    // Custom exception
    public DivideByZeroUncheckedException(String message) {
        super(message);
    }
}
