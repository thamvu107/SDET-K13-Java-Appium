package src.lessons.lesson_11.drivers;

public class AndroidDriver extends AppiumDriver{
    @Override
    public void createSession() {
        System.out.println("Create Android session");
    }

    @Override
    public void closeSession() {
        System.out.println("Close Android session");
    }
}
