package src.lessons.lesson_13;

public class DivideByZeroCheckedException extends Exception{
    public DivideByZeroCheckedException() {
        super();
    }

    public DivideByZeroCheckedException(String message) {
        super(message);
    }
}
