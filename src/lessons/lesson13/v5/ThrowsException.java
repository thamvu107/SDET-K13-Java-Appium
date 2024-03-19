package src.lessons.lesson13.v5;

public class ThrowsException {
    /*
     * Action trigger(function)(1): Param + logic -> output
     * (1) Force to handle the exception -> checked Exception - Compiler- compile time - IOException*/
    public static int divide(int num1, int num2) throws DivideByZeroCheckedException {
        if (num2 == 0) {
            //custom exception
            throw new DivideByZeroCheckedException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // checked Exception
        try {
            int result = ThrowsException.divide(3, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroCheckedException ignored) {

        }
        System.out.println("Continuing processing after exception handling");

    }
}
