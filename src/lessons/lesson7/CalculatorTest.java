package src.lessons.lesson7;

public class CalculatorTest {
    public static void main(String[] args) {
        // Argument
        Calculator.welcome("Ti");
        int total1 = Calculator.sum(7, 3);
        System.out.println("sum(7,3) = " + total1);

        int total2 = Calculator.sum(7, "3");
        System.out.println("sum(7, \"3\") = " + total2);

        int total3 = Calculator.sum(7, 3, 5);
        System.out.println("sum(7, 3, 5) = " + total3);

        int total4 = VarargsCalculator.sum(7, 3);
        System.out.println("sum(7, 3) = " + total4);

        int total5 = VarargsCalculator.sum(7, 3, 5, 10);
        System.out.println("sum(7, 3, 5, 10) = " + total5);


    }
}
