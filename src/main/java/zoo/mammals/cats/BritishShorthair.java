package zoo.mammals.cats;

public class BritishShorthair implements Cat{

    @Override
    public String getName() {
        return("British Shorthair");
    }

    @Override
    public void move() {
        System.out.println("..");
    }
    
}