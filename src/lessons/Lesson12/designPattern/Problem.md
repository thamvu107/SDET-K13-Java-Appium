Problem:

Quack: Quack, Speak, Mute
Fly: FlyWithWing, FlyNoway
Duck: MallardDuck, BabyDuck, Decoy

Controller/method: fly, quack


abstract class Duck {
    abstract void fly();
    abstract void quack();
}

fly(Duck duck){
    duck.fly();
}

// Strategy pattern: 
1. Family member large: 21 templates ( Type of page - HTML page), different components
2. Many variant behaviors: each component has different behaviors

Step to do:
1. List all behaviors in the interfaces
2. Create classes to implement each interface
3. Create parent class includes behavior that are interfaces was created
4. Create concrete class with a constructor to initialize the behavior ( which is a interface)
