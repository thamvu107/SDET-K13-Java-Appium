package src.labs.lab_9;

import src.labs.lab_9.Tiger.TigerBuilder;
import src.labs.lab_9.Horse.HorseBuilder;
import src.labs.lab_9.Dog.DogBuilder;
import src.labs.lab_9.Bird.BirdBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    public static List<Animal> getTigers(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            TigerBuilder builder = new TigerBuilder(name);
            Animal animal = builder.setFlyable(false).build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getHorses(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            HorseBuilder builder = new HorseBuilder(name);
            Animal animal = builder.setFlyable(false).build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getDogs(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            DogBuilder builder = new DogBuilder(name);
            Animal animal = builder.setFlyable(false).build();
            list.add(animal);
        }

        return list;
    }

    public static List<Animal> getBirds(String[] names) {
        List<Animal> list = new ArrayList<>();
        for (String name : names) {
            BirdBuilder builder = new BirdBuilder(name);
            Animal animal = builder.build();
            list.add(animal);
        }

        return list;
    }

    public static void printAllRacer(List<Animal> animalList) {
        System.out.printf("%-4s %-15s %-8s %-7s km/h\n", "Id", "Name", "Type", "Speed");
        for (Animal animal : animalList) {
            System.out.printf("%-4s %-15s %-8s %-7s km/h\n", animal.getId(), animal.getName(), "(".concat(animal.getType()).concat(")"), animal.getSpeed());
        }
    }

    public static Animal findAnimalWinner(List<Animal> animalList) {
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
