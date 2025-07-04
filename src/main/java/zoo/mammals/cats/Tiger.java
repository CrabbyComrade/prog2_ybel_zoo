package zoo.mammals.cats;

public class Tiger implements Cat {

    @Override
    public String getName() {
        return("Tiger");
    }

    @Override
    public void move() {
        System.out.println("..");
    }
    
}