package src.labs.lab_7.animal;

import src.labs.lab_7.employee.Employee;

import java.util.List;

public class AnimalController {

    public  static void printAllAnimal(List<Animal> animalList){
        System.out.println("Print all animal:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }

    public static Animal findWinnerAnimal(List<Animal> animalList) {
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (speed > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

}
