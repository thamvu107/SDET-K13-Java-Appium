package src.lessons.lesson_13.v4;

public class DivideByZeroUncheckedException extends RuntimeException{
    public DivideByZeroUncheckedException() {
        super();
    }

    // Custom exception
    public DivideByZeroUncheckedException(String message) {
        super(message);
    }
}
