package zoo.mammals.primates;

public class Chimpanzee implements Primate {

    @Override
    public String getName() {
        return("Chimpanzee");
    }

    @Override
    public void move() {
        System.out.println("Swoosh");
    }
    
}
