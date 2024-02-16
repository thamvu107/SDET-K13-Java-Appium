package src.lessons.lesson_3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(Arrays.toString(weekdays));

        System.out.println("\nForIn looping");
        printDayTypeForInLooping(weekdays);

        System.out.println("\nFor enhance looping");
        printDayTypeForEnhanceLooping(weekdays);
    }

    private static boolean isWeekend(String day) {
        return day.equals("Sat") || day.equals("Sun");
    }

    private static void printDayTypeForInLooping(String[] weekdays) {
        for (int index = 0; index < weekdays.length; index++) {
            String dayType = isWeekend(weekdays[index]) ? "Weekend" : "Weekday";
            System.out.printf("%s is %s\n", weekdays[index], dayType);
        }
    }

    private static void printDayTypeForEnhanceLooping(String[] weekdays) {
        for (String day : weekdays) {
            String dayType = isWeekend(day) ? "Weekend" : "Weekday";
            System.out.printf("%s is %s\n", day.toUpperCase(), dayType);
        }
    }
}
