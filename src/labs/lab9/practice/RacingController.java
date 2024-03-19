package src.labs.lab9.practice;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public static List<Animal> getTigers(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            Animal animal = Tiger.builder(name)
                    .setFlyable(false)
                    .build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getHorses(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            Animal animal = Horse.builder(name)
                    .setFlyable(false)
                    .build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getDogs(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            Animal animal = Dog.builder(name)
                    .setFlyable(false)
                    .build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getFlyableBirds(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            Animal animal = Bird.builder(name)
                    .setFlyable(true)
                    .build();
            list.add(animal);
        }
        return list;
    }

    public static List<Animal> getUnFlyableBirds(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            Animal animal = Bird.builder(name)
                    .setFlyable(false)
                    .build();
            list.add(animal);
        }
        return list;
    }

    public static void printAnimals(List<Animal> animalList) {
        System.out.printf("\n%-3s %-4s %-15s %-8s %-10s %-6s km/h\n", "No", "Id", "Name", "Type", "Flyable", "Speed");
        int i = 0;
        for (Animal animal : animalList) {
            System.out.printf("%-3d %-4s %-15s %-8s %-10s %-6d km/h\n", ++i, animal.getId(), animal.getName(), "(".concat(animal.getType()).concat(")"), animal.isFlyable() ? "Flyable" : "", animal.getSpeed());
        }
    }

    public static void printRacingAnimals(List<Animal> animalList) {
        System.out.printf("\n%-3s %-4s %-15s %-8s %-6s\n", "No", "Id", "Name", "Type", "Speed");
        int i = 0;
        for (Animal animal : animalList) {
            System.out.printf("%-3d %-4s %-15s %-8s  %-6s km/h\n", ++i, animal.getId(), animal.getName(), "(".concat(animal.getType()).concat(")"), animal.getSpeed());
        }
    }

    public static List<Animal> getRacingAnimalList(List<Animal> animalList) {
        List<Animal> racingAnimalList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                racingAnimalList.add(animal);
            }
        }

        return racingAnimalList;
    }

    public static Animal findAnimalWinner(List<Animal> animalList) {
        // TODO : handle case animalList: null, empty
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (speed > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void printAnimalWinner(Animal winner) {
        System.out.printf("\nAnimal Winner is %s - %s (%s), with speed: %d km/h", winner.getId(), winner.getName(), winner.getType(), winner.getSpeed());
    }
}
