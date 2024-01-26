package src.lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseStatementCalendar {
    public static void main(String[] args) {
        System.out.println("Please input a day number from 1 to 7:");
        int dayNum = inputDayNumber();

        if (checkDayNumValid(dayNum)) {
            String dayName = getDayOfWeek(dayNum);
            System.out.printf("Today is %s\n", dayName);
        } else {
            System.out.println("Invalid day number.");
        }

    }

    private static boolean checkDayNumValid(int dayNum) {
        if (dayNum >0 && dayNum < 8)
            return true;
        return false;
    }


    // TODO move to Util file
    private static int inputDayNumber() {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        return day;
    }

    private static String getDayOfWeek(int day) {
        String dayName = null;
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
            default:
                dayName = "Sunday";
        }

        return dayName;
    }
}
