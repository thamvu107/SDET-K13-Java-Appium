package src.lessons.lesson_13;

public class CalculatorV3 {
    /*
     * Action trigger(function)(1): Param + logic -> output
     * (1) Force to handle the exception -> checked Exception - Compiler- compile time - IOException*/
    public static int divide(int num1, int num2) throws DivideByZeroCheckedException {
        if (num2 == 0) {
            //custom exception
            throw new DivideByZeroCheckedException("Num2 should not be 0");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // checked Exception
        int result = 0;
        try {
            CalculatorV3.divide(3, 0);
        } catch (DivideByZeroCheckedException ignored) {}
        System.out.println(result);
    }
}
