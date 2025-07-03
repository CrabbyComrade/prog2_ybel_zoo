package zoo;

import zoo.fishes.Fish;

public class Aquarium extends Zoo<Habitat<Fish>, Fish> { // Only allows Habitats of Fish

    public Aquarium() {
        super();
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        // Habitats for aquarium
        Habitat<Fish> coralReef = new Habitat<>("Coral Reef");
        Habitat<Fish> amazonRiver = new Habitat<>("Amazon River");
        Habitat<Fish> deepSea = new Habitat<>("Deep Sea");

        aquarium.build(coralReef);
        aquarium.build(amazonRiver);
        aquarium.build(deepSea);

        // Print the habitats it has
        System.out.println("Aquarium has these fish habitats:");
        aquarium.visitAllHabitats();
    }
}
