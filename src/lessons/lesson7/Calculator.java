package src.lessons.lesson7;

public class Calculator {
    /*
     [access modifier] | class method/or Not (optional) | return type | function's name (params)
  */
    public static void welcome(String name) {
        System.out.println("Welcome ".concat(name));
    }

    // Method signature = method name &  params
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int num1, String num2) {
        return num1 + Integer.parseInt(num2);
    }

    /*
     * Overloading?
     *  + SAME class
     *  + Compile time
     *  + Base on method signature: same function + different params
     *
     * */
}
