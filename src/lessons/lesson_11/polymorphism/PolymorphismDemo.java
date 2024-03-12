package src.lessons.lesson_11.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // An object can trans into different form in the model
        Animal animal= new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
