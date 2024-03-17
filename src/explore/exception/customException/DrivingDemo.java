package src.explore.exception.customException;

public class DrivingDemo {
    public static void main(String[] args) {
        // Throwing a Custom Exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an InvalidAgeException: " + e.getMessage());
        }

    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age should not be smaller than 18");
        }
        System.out.println("Valid age: " + age);
    }
}
