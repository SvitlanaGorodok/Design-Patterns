package strategy.ducks;

public class DuckDecoy extends Duck{
    @Override
    public void display() {
        System.out.println("I'm not a duck, I'm duck decoy!");
    }
}
