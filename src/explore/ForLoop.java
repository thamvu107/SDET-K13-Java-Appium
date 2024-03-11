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
