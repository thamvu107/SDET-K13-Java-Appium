package src.explore.exception.customException;

public class InvalidAgeException extends Exception{
    // Throwing a Custom Exception
    public InvalidAgeException(String message) {
        super(message);
    }
}
