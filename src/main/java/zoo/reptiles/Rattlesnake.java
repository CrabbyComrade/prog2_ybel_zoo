package zoo.reptiles;

public class Rattlesnake implements Reptile{

    @Override
    public String getName() {
        return("Rattlesnake");
    }

    @Override
    public void move() {
        System.out.println("slither");
    }
    
}
