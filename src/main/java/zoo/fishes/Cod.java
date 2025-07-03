package zoo.fishes;

public class Cod implements Fish{
    @Override
    public void move() {
        System.out.println("Blubb blubb");
    }

    @Override
    public String getName() {
        return("Cod");
    }
}