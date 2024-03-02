package src.labs.lab_9;

import src.labs.lab_9.Animal.AnimalBuilder;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacingDemo {
    /*
     * Tiger: Max 100 Km/h
     * Horse: Max 75 km/h
     * Dog: Max 60 KM/h*

     * Racing animal with builder design pattern (adding attribute flyable)
     * Eagle, Falcon, Tiger, Snake....
     * Animal tiger = new Animal.Builder().withWings(false).....build();
     * Animal falcon = new Animal.Builder().withWings(true).....build();
     *
     * Animal
     * + ID
     * + type
     * + speed
     * + flyable
     * */
    public static void main(String[] args) {
        AnimalBuilder snakeBuilder = new AnimalBuilder("Kaa");
        Animal snake = snakeBuilder
                .setType("Snake")
                .setFlyable(false)
                .build();

        String[] unFlyableBirds = {"Penguin", "Ostrich"};
        List<Animal> unFlyableBirdList = RacingControl.getUnFlyableBirds(unFlyableBirds);

        String[] birdNames = {"Eagle", "Falcon"};
        List<Animal> flyableBirdList = RacingControl.getFlyableBirds(birdNames);

        //String[] tigerNames = {"Shere Khan", "Rajah"};
        String[] tigerNames = {"Shere Khan"};
        List<Animal> tigerList = RacingControl.getTigers(tigerNames);

        //String[] horseNames = {"Cowboy Bean", "Pink Horse"};
        String[] horseNames = {"Cowboy Bean"};
        List<Animal> horseList = RacingControl.getHorses(horseNames);

        String[] dogNames = {"Toto", "Scooby-Doo", "Goofy", "Odie", "Snoopy", "Droopy", "Hooch", "Goofy", "Bolt", "Copper", "Dug", "Zero", "Astro", "Eddie", "Copper", "Goofy", "Goofy"};
        List<Animal> dogList = RacingControl.getDogs(dogNames);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(snake);
        animalList.addAll(unFlyableBirdList);
        animalList.addAll(flyableBirdList);
        animalList.addAll(tigerList);
        animalList.addAll(horseList);
        animalList.addAll(dogList);
        System.out.println("\nAll animal list");
        RacingControl.printAnimals(animalList);

        List<Animal> racingAnimalList = RacingControl.getRacingAnimalList(animalList);
        System.out.println("\nRacing animals ( Animal are not able to fly)");
        RacingControl.printRacingAnimals(racingAnimalList);

        Animal winner = RacingControl.findAnimalWinner(racingAnimalList);

        RacingControl.printAnimalWinner(winner);

    }
}
