package src.lessons.Lesson_12.designPattern;

public class Mute implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I'm mute");
    }
}
