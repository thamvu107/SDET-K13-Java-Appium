package src.lessons.lesson13.v5;

public class DivideByZeroCheckedException extends Exception{
    public DivideByZeroCheckedException() {
        super();
    }

    public DivideByZeroCheckedException(String message) {
        super(message);
    }
}
