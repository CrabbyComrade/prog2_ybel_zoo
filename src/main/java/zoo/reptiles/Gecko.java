package zoo.reptiles;

public class Gecko implements Reptile {

    @Override
    public String getName() {
        return("Gecko");
    }

    @Override
    public void move() {
        System.out.println("Gecko");
    }
    
}
