package src.lessons.Lesson12.designPattern;

public class Duck {
    protected IQuackBehaviour quackBehaviour;
    protected IFlyBehaviour flyBehaviour;

    protected void performQuack() {
        quackBehaviour.quack();
    }

    protected void performFly() {
        flyBehaviour.fly();
    }

    public void changeFlyBehavior(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
