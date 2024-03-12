package src.explore;

public class ForLoop {
    /*
     * */
    public static void main(String[] args) {
        int count = 0;
        for (print('X'); print('Y') && (count < 2); print('Z')) {
            count++;
            print('W');
        }

        printNTimes("JavaDoc", 7);
    }

    /**
     * Display message, numTimes times, one messages per line.
     * @param message the message to be displayed
     * @param numTime number of times to display message
     */
    private static void printNTimes(String message, int numTime) {
        for (int index = 0; index < numTime ; index++) {
            System.out.println(message);
        }
    }

    public static boolean print(char character) {
        print1(character);
        return true;
    }

    public static boolean print1(char character) {
        System.out.print(character);
        return true;
    }

}
