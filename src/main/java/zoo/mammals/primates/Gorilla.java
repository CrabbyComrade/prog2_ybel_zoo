package zoo.mammals.primates;

public class Gorilla implements Primate{

    @Override
    public String getName() {
        return("Gorilla");
    }

    @Override
    public void move() {
        System.out.println("Swoosh");
    }
}
