package src.labs.lab6.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConverter {
    public static void main(String[] args) {

        /*
         * Input String = "2hrs and 5 minutes"
         * calculate how many minutes in total
         */
        String timeString =  "2 hrs and 1 minute";
//        String timeString = "1 hr and 2 minutes";
//        String timeString = "1 hr";
//        String timeString = "1 minute";
//        String timeString = "invalid time";
        System.out.println(timeString);
        int totalMinutes = calculateTotalMinutes(timeString);
        if (totalMinutes == -1) {
            System.out.println("Invalid time string");
        } else {
            System.out.printf("Total: %d %s", totalMinutes, totalMinutes > 1 ? "minutes" : "minute");
        }

    }

    private static int calculateTotalMinutes(String timeString) {
        String pattern = "(?:(\\d+)\\s*hrs?)?(?:\\s+and\\s+)?(?:(\\d+)\\s*minutes?)?";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(timeString);
        if (matcher.matches()) {
            String hours = matcher.group(1);
            String minutes = matcher.group(2);
            int hrs = hours == null ? 0 : Integer.parseInt(hours);
            int mins = minutes == null ? 0 : Integer.parseInt(minutes);
            return hrs * 60 + mins;
        } else {
            return -1;
        }
    }
}
