package src.lessons.lesson_8;

public class RobotDog {
    /*
     * Class members?
     * Class variable & Class method <<< static -> class member.
     * Can we override class member
     *  YES: Class variable
     *  NO: class method
     *
     * */
    // Class variable || SHARED value
    public static int dogId; // same dogId = 0 : default value of int
    private String name; // name = null;
    public RobotDog(){
        dogId++;
    }

    public int getDogId() {
        return dogId;
    }

    // Class method
    public static void doSth(){
        System.out.println(dogId);
//        System.out.println(name); none-static can access static - static not access none-static
    }

    public static  void doAnotherSth(){
        System.out.println("RobotDog do something");
    }
}
