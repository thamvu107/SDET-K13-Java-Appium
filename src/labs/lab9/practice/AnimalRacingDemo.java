package src.labs.lab9.practice;

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
        Animal snake = Animal.builder("Kaa")
                .setType("Snake")
                .setFlyable(false)
                .build();

        String[] unFlyableBirds = {"Penguin", "Ostrich"};
        List<Animal> unFlyableBirdList = RacingController.getUnFlyableBirds(unFlyableBirds);

        String[] birdNames = {"Eagle", "Falcon"};
        List<Animal> flyableBirdList = RacingController.getFlyableBirds(birdNames);

        //String[] tigerNames = {"Shere Khan", "Rajah"};
        String[] tigerNames = {"Shere Khan"};
        List<Animal> tigerList = RacingController.getTigers(tigerNames);

        //String[] horseNames = {"Cowboy Bean", "Pink Horse"};
        String[] horseNames = {"Cowboy Bean"};
        List<Animal> horseList = RacingController.getHorses(horseNames);

        String[] dogNames = {"Toto", "Scooby-Doo", "Goofy", "Odie", "Snoopy", "Droopy", "Hooch", "Goofy", "Bolt", "Copper", "Dug", "Zero", "Astro", "Eddie", "Copper", "Goofy", "Goofy"};
        List<Animal> dogList = RacingController.getDogs(dogNames);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(snake);
        animalList.addAll(unFlyableBirdList);
        animalList.addAll(flyableBirdList);
        animalList.addAll(tigerList);
        animalList.addAll(horseList);
        animalList.addAll(dogList);
        System.out.println("\nAll animal list");
        RacingController.printAnimals(animalList);

        List<Animal> racingAnimalList = RacingController.getRacingAnimalList(animalList);
        System.out.println("\nRacing animals ( Animal are not able to fly)");
        RacingController.printRacingAnimals(racingAnimalList);

        Animal winner = RacingController.findAnimalWinner(racingAnimalList);

        RacingController.printAnimalWinner(winner);

    }
}
