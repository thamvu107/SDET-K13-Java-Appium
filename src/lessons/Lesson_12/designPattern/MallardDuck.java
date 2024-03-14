package src.lessons.Lesson_12.designPattern;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.quackBehaviour = new Quack();
        this.flyBehaviour = new FlyWithWings();
    }
}
