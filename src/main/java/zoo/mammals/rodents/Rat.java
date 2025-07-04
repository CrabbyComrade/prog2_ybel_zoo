package zoo.mammals.rodents;

public class Rat implements Rodent{

    @Override
    public String getName() {
        return("Rat");
    }

    @Override
    public void move() {
        System.out.println("skitter");
    }
    
}
