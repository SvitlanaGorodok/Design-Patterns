package factory;

public class PizzaCheese extends Pizza{
    IngredientFactory factory;

    public PizzaCheese(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = factory.createDough();
        sauce = factory.createSauce();
        chesse = factory.createCheese();
    }

}
