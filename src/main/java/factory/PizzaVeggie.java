package factory;

public class PizzaVeggie extends Pizza{
    IngredientFactory factory;

    public PizzaVeggie(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = factory.createDough();
        sauce = factory.createSauce();
        chesse = factory.createCheese();
        veggies = factory.createVeggies();
    }

}
