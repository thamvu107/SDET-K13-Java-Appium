package src.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lab_2 {
    private static final DecimalFormat df = new DecimalFormat(".0");
    private static final float MIN_NORMAL_WEIGHT = 18.5f;
    private static final float MAX_NORMAL_WIGHT = 24.9f;
    private static final float MAX_OVER_WEIGHT = 29.9f;

    public static void main(String[] args) {
        /*
        // Problem 1:
        A. Understand problem: ------------------------------------------------------------------
        Get input height
        Get input weight

        calculate BMI = weight /(height ** height);

        Underweight = <18.5
        Normal weight = 18.5 – 24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater

        // B: Design 2: ------------------------------------------------------------------
        1. init  a scanner to get input values:
            height
            weight
        2. close scanner when finish

        3. calculate BMI = weight /(height ** height);

        4. create a function:
            Underweight = <18.5
            Normal weight = 18.5 – 24.9
            Overweight = 25–29.9
            Obesity = BMI of 30 or greater

        // Init constants:
            MIN_NORMAL_WEIGHT = 18.5
            MAX_NORMAL_WIGHT = 24.9
            MAX_OVER_WEIGHT = 29.9
        */
        // C: Write code ------------------------------------------------------------------

        // Get input height & weight
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (in meter):");
        float height = input.nextFloat();
        System.out.println("Please enter your weight (in kg): ");
        float weight = input.nextFloat();
        input.close();

        float BMI = weight / (height * height);
        String formattedBMI = df.format(BMI);
        System.out.printf("Your BMI is: %s that is %s", formattedBMI, resultBMI(BMI));
    }

    private static String resultBMI(float BMI) {
        if (BMI < MIN_NORMAL_WEIGHT) {
            return "Underweight";
        } else if (BMI < MAX_NORMAL_WIGHT) {
            return "Normal weight";
        } else if (BMI < MAX_OVER_WEIGHT) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
