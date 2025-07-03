package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo<H extends Habitat<A>, A extends Animal> {
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
        for (H hab : habitats) {
            System.out.println(hab.getName());
        }
    }
}
