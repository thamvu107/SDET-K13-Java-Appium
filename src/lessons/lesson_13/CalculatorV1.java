package src.lessons.lesson_13;

public class CalculatorV1 {
    public static int divide(int num1, int num2) {
        //custom exception
        if (num2 == 0) {
            throw new DivideByZeroException("num2 should not be 0");
        }
        return num1 / num2;
    }

    public static int divideV2(int num1, int num2) {

        if (num2 == 0)
            throw new IllegalArgumentException("num2 should not be 0");
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Unchecked exception
        try {
            CalculatorV1.divide(3, 0);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Illegal Argument Exception");
        } catch (DivideByZeroException d) {
            // this is duplicated- since it was handled on divide function
            System.out.println("Divided by zero");
        } catch (ArithmeticException e2) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Cleanup data");
        }

        System.out.println("Continue processing ....");


    }
}
