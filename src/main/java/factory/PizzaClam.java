package factory;

public class PizzaClam extends Pizza{
    IngredientFactory factory;

    public PizzaClam(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = factory.createDough();
        sauce = factory.createSauce();
        chesse = factory.createCheese();
        clams = factory.createClams();
    }

}
