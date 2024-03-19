package src.lessons.lesson7;

public class VarargsCalculator {
    // Varargs | Rest params (javascript)
    public static int sum(int num1, int... nums) {
        int total = num1;
        for (int value: nums){
            total += value;
        }
        return total;
    }
}
