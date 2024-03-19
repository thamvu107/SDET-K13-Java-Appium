package src.lessons.lesson13.v1;

public class ExceptionHandled {
    public static void main(String[] args) {
        /**
         * Problems:
         * Rest of the code is not executed
         * All the code after exception will not be executed.
         *
         * Solution:
         * as displayed in the above example, rest of the code is executed i.e. rest of the code...
         * statement is printed
         * */
        try {
            ExceptionHandled.divide(3, 0); // may throw exception
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("rest of the code...");
    }

    public static int divide(int num1, int num2) {

        return num1 / num2;
    }
}
