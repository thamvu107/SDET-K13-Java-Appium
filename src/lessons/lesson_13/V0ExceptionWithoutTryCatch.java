package src.lessons.lesson_13;

public class V0ExceptionWithoutTryCatch {
    public static void main(String[] args) {
        /**
         * Problems:
         * Rest of the code is not executed
         * All the code after exception will not be executed.
         *
         * */
        V0ExceptionWithoutTryCatch.divide(3, 0); // may throw exception
        System.out.println("rest of the code...");
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
