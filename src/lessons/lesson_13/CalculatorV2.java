package src.lessons.lesson_13;

public class CalculatorV2 {
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            //custom exception
            throw new DivideByZeroException("Num2 should not be 0");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        // Unchecked Exception
        int result = CalculatorV2.divide(3, 0);
        System.out.println(result);
    }
}
