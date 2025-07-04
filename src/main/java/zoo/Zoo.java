package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.fishes.Catfish;
import zoo.mammals.cats.Tiger;

public class Zoo<H extends Habitat<? extends Animal>> {
    private List<H> habitats;

    public Zoo() {
        habitats = new ArrayList<>();
    }

    public void build(H habitat) { // Adds a habitat to zoo
        if (!habitats.contains(habitat)) { // Only add if its not already there
            habitats.add(habitat);
            System.out.println(habitat.getName() + " has been built in zoo.");
        } else {
            System.out.println(habitat.getName() + " is already in zoo.");
        }
    }

    public void abandon(H habitat) { // Removes a habitat from zoo
        if (habitats.contains(habitat)) { // Only try to remove if there is a habitat to remove
            habitats.remove(habitat);
            System.out.println(habitat.getName() + " has been abandoned from zoo.");
        } else {
            System.out.println(habitat.getName() + " is not in zoo.");
        }
    }

    public void visitAllHabitats() { // Prints names of all habitats
        System.out.println("Visiting habitats in  zoo:");
        for (Habitat<? extends Animal> hab : habitats) {
            System.out.println(hab.getName());
        }
    }

    public static void main(String[] args) {
        // habitats accepting one animal type each
        Habitat<Tiger> tigerHabitat = new Habitat<>("Tiger Habitat");
        Habitat<Catfish> catfishHabitat = new Habitat<>("Catfish Habitat");
        tigerHabitat.add(new Tiger());
        catfishHabitat.add(new Catfish());

        Zoo<Habitat<? extends Animal>> zoo = new Zoo<>();

        zoo.build(tigerHabitat);
        zoo.build(catfishHabitat);

        zoo.visitAllHabitats();
        for (Habitat<? extends Animal> h : zoo.habitats) {
            for (Animal a : h.animals) {
                a.getName();
                a.move();
            }
        }
    }
}
