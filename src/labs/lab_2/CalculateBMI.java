package src.labs.lab_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateBMI {
    private static final DecimalFormat df = new DecimalFormat(".0");
    private static final float MIN_NORMAL_BMI = 18.5f;
    private static final float MAX_NORMAL_BMI = 24.9f;
    private static final float MAX_OVER_BMI = 29.9f;

    private static final String UNDER = "Underweight";
    private static final String NORMAL = "Normal weight";
    private static final String OVER = "Overweight";
    private static final String OBESITY = "Obesity";

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
            MIN_NORMAL_BMI = 18.5
            MAX_NORMAL_BMI = 24.9
            MAX_OVER_BMI = 29.9

         */
        // C: Write code ------------------------------------------------------------------

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

        /*
        // Problem 2: Suggest user to increase/decrease weight
        A: Understand:
            Suggest user ( print message):
               increase/decrease weight
        B: break small problems:
            Underweight => increase weight = ? => to min_normal_weight = ?
            Overweight => decrease weight = ? => to max_normal_weight =?
            Obesity = BMI of 30 or greater => decrease weight = ? => to max_normal_weight
            Normal weight =>  good job & keep going.

            weight = ?
                ( BMI = weight/ (height * height) )
                => weight = BMI * height * height

           min_normal_weight =  MIN_NORMAL_BMI * height * height
           max_normal_weight =  MAX_NORMAL_BMI * height * height

           if( Underweight)
                increase  suggestWeight = minNormalWeight - yourWeight
           Else if( Overweight && Obesity)
                decrease suggestWeight = maxNormalWeight - yourWeight
           Else
                Good Job! Keep going your weight!
        */

        // C: Write code
        System.out.println("Suggestion: " + suggestWeight(userHeight, userWeight, resultBMI));

    }

    private static float calculateBMI(float weight, float height) {
        float BMI = weight / (height * height);
        return BMI;
    }

    private static String resultBMI(float BMI) {
        if (BMI < MIN_NORMAL_BMI) {
            return UNDER;
        } else if (BMI < MAX_NORMAL_BMI) {
            return NORMAL;
        } else if (BMI < MAX_OVER_BMI) {
            return OVER;
        } else {
            return OBESITY;
        }
    }

    private static String suggestWeight(float userHeight, float userWeight, String resultBMI) {
        float minNormalWeight = MIN_NORMAL_BMI * userHeight * userHeight;
        float maxNormalWeight = MAX_NORMAL_BMI * userHeight * userHeight;
        float suggestWeight;
        String suggestMessage = null;
        if (resultBMI == UNDER) {
            suggestWeight = minNormalWeight - userWeight;
            suggestMessage = String.format("Consider increasing your weight (%s kg) to reach the standard BMI", df.format(suggestWeight));
        } else if (resultBMI == OVER || resultBMI == OBESITY) {
            suggestWeight = userWeight - maxNormalWeight;
            suggestMessage = String.format("Consider decreasing your weight (%s kg) to reach the standard BMI", df.format(suggestWeight));
        } else if (resultBMI == NORMAL) {
            suggestMessage = "Good job! Keep going your weight in standard BMI.";
        }
        return suggestMessage;
    }
}
