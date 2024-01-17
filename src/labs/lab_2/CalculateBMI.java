package src.labs.lab_2;

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

        float BMI = calculateBMI(userWeight, userHeight);
        String resultBMI = resultBMI(BMI);
        System.out.printf("Your BMI (%s) is %s\n", df.format(BMI), resultBMI);

        System.out.println("Suggestion: " + suggestWeight(resultBMI, userWeight, userHeight));
    }

    private static float calculateBMI(float weight, float height) {
        float BMI = weight / (height * height);
        return BMI;
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

    private static String suggestWeight(String resultBMI, float userWeight, float userHeight) {
        String suggestMessage = null;
        if (resultBMI == UNDER) {
            suggestMessage = String.format("Consider increasing your weight (%s kg) to reach the standard BMI", increaseWeight(userWeight, userHeight));
        } else if (resultBMI == OVER || resultBMI == OBESITY) {
           suggestMessage = String.format("Consider decreasing your weight (%s kg) to reach the standard BMI", decreaseWeight(userWeight, userHeight));
        } else if (resultBMI == NORMAL) {
            suggestMessage = "Good job! Keep going your weight in standard BMI.";
        }
        return suggestMessage;
    }

    private static String increaseWeight(float userWeight, float userHeight) {
        float minWeight = MIN_BMI * userHeight * userHeight;
        String weight =  df.format(minWeight - userWeight);
        return weight;
    }

    private static String decreaseWeight(float userWeight, float userHeight) {
        float maxWeight = MAX_BMI * userHeight * userHeight;
        String weight = df.format(userWeight - maxWeight);
        return weight;
    }
}
