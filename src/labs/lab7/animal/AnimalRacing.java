package src.labs.lab7.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    /*
     * Racing animal simple version
     * Horse: Max 75 km/h
     * Tiger: Max 100 Km/h
     * Dog: Max 60 KM/h*
     *
     * Create an Animal class with a method speed() which return a random speeds
     * Create 3 objects for those 3 animal type
     * Run and see which animal is winner for racing
     * Print result with format: Winner is <Animal name>, with speed: <speed>
     * int randomSpeed = new SecureRandom().nextInt(50);
     * */

    public static void main(String[] args) {
        String[] animals = {AnimalController.UNNAMED, "Tom"};
        List<Animal> animalList = AnimalController.getGeneralAnimaList(animals);

        String[] dogNames = {AnimalController.UNNAMED, "Toto", "Scooby-Doo", "Goofy", "Odie", "Snoopy", "Droopy", "Hooch", "Goofy", "Bolt", "Copper", "Dug", "Zero", "Astro", "Eddie", "Copper", "Goofy", "Goofy", "Goofy", "Goofy", "Goofy", "Goofy", "Goofy",};
        List<Animal> dogList = AnimalController.getDogList(dogNames);

        String[] horseNames = {"Cowboy Bean"};
        List<Animal> horseList = AnimalController.getHorseList(horseNames);

        String[] tigerNames = {"Rajah"};
        List<Animal> tigerList = AnimalController.getTigerList(tigerNames);


        List<Animal> allAnimalRacingList = new ArrayList<>();
        allAnimalRacingList.addAll(animalList);
        allAnimalRacingList.addAll(dogList);
        allAnimalRacingList.addAll(horseList);
        allAnimalRacingList.addAll(tigerList);
        AnimalController.printAllAnimal(allAnimalRacingList);

        Animal winner = AnimalController.findWinnerAnimal(allAnimalRacingList);
        AnimalController.printWinnerAnimal(winner);
    }

}
