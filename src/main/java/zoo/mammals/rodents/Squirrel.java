package zoo.mammals.rodents;

public class Squirrel implements Rodent {
    @Override
    public String getName() {
        return("Squirrel");
    }

    @Override
    public void move() {
        System.out.println("skitter");
    }
}
