package src.lessons.lesson_13.v2;

public class UncheckExceptionHandled {

    public static void main(String[] args) {
        // Unchecked exception
        try {
            int result = UncheckExceptionHandled.divide(3, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Cleanup data");
        }
        System.out.println("Continuing processing after exception handling");

    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}
