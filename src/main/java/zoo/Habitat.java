package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.fishes.Catfish;
import zoo.fishes.Cod;
import zoo.fishes.Fish;
import zoo.mammals.Mammal;
import zoo.mammals.cats.*;
import zoo.mammals.primates.*;

public class Habitat<T extends Animal> { // Only accepts types extending Animal

    private String name;
    public List<T> animals;

    public Habitat(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void add(T animal) { // Adds an animal to the habitat
        if (!animals.contains(animal)) { // Only add if its not already there
            animals.add(animal);
            System.out.println(animal.getName() + " added to habitat.");
        } else {
            System.out.println(animal.getName() + " is already in habitat.");
        }
    }

    public void remove(T animal) { // Removes an animal from the habitat
        if (animals.contains(animal)) { // Only try to remove if there is an animal to remove
            animals.remove(animal);
            System.out.println(animal.getName() + " removed from habitat.");
        } else {
            System.out.println(animal.getName() + " is not in habitat.");
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Two test habitats
        Habitat<Fish> fishHabitat = new Habitat<>("Fish Habitat");
        Habitat<Mammal> mammalHabitat = new Habitat<>("Mammal Habitat");

        // Animals for the habitats
        Fish catfish = new Catfish();
        Fish cod = new Cod();

        Mammal tiger = new Tiger();
        Mammal gorilla = new Gorilla();

        // Add animals to habitats
        fishHabitat.add(catfish);
        fishHabitat.add(cod);

        mammalHabitat.add(tiger);
        mammalHabitat.add(gorilla);

        for(Animal fish : fishHabitat.animals) {
            System.out.println("Animal :"+fish.getName()+", Movement :");
            fish.move();
        }
    }
}
