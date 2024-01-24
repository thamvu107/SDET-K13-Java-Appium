package src.lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseStatementCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess and input a number from 1 to 7:");
        int day = input.nextInt();

        if (day >= 2 && day <= 6)
            System.out.println("Weekdays!");
        else if (day == 7 || day == 8) {
            System.out.println("Weekends!");
        } else {
            System.out.println("Invalid number.");
        }

        String dayName;
        getDayOfWeek(day);
    }

    private static void getDayOfWeek(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid number.");

        }
    }
}
