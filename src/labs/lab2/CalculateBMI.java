package src.labs.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateBMI {
    private static final DecimalFormat df = new DecimalFormat(".0");
    private static final float MIN_BMI = 18.5f;
    private static final float MAX_BMI = 24.9f;
    private static final float MAX_OVER_BMI = 29.9f;

    private static final String UNDER = "Underweight";
    private static final String NORMAL = "Normal weight";
    private static final String OVER = "Overweight";
    private static final String OBESITY = "Obesity";

    public static void main(String[] args) {
        // Get input height & weight
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (in meter):");
        float userHeight = input.nextFloat();
        System.out.println("Please enter your weight (in kg): ");
        float userWeight = input.nextFloat();
        input.close();

        float userBMI = calculateBMI(userWeight, userHeight);
        String resultBMI = resultBMI(userBMI);
        System.out.printf("Your BMI (%s) is %s\n", df.format(userBMI), resultBMI);

        System.out.println("Suggestion: " + suggestWeight(resultBMI, userBMI, userHeight));
    }

    private static float calculateBMI(float weight, float height) {
        return weight / (height * height);
    }

    private static String resultBMI(float BMI) {
        if (BMI < MIN_BMI) {
            return UNDER;
        } else if (BMI < MAX_BMI) {
            return NORMAL;
        } else if (BMI < MAX_OVER_BMI) {
            return OVER;
        } else {
            return OBESITY;
        }
    }

    private static String suggestWeight(String resultBMI, float userBMI, float userHeight) {
        String suggestMessage = null;
        float suggestWeight;

        switch (resultBMI) {
            case UNDER:
                suggestWeight = (MIN_BMI - userBMI) * userHeight * userHeight;
                suggestMessage = String.format("Consider increasing your weight (%s kg) to reach the standard BMI", df.format(suggestWeight));
                break;
            case OVER:
            case OBESITY:
                suggestWeight = (userBMI - MAX_BMI) * userHeight * userHeight;
                suggestMessage = String.format("Consider decreasing your weight (%s kg) to reach the standard BMI", df.format(suggestWeight));
                break;
            default:
                suggestMessage = "Good job! Keep going your weight in standard BMI.";
        }
        return suggestMessage;
    }
}
