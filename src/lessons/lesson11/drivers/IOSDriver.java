package src.lessons.lesson11.drivers;

public class IOSDriver extends AppiumDriver{
    @Override
    public void createSession() {
        System.out.println("Create IOS session");
    }

    @Override
    public void closeSession() {
        System.out.println("Closing IOS session");
    }
}
