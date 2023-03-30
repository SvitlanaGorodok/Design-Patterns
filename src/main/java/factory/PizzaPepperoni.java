package factory;

public class PizzaPepperoni extends Pizza{
    IngredientFactory factory;

    public PizzaPepperoni(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = factory.createDough();
        sauce = factory.createSauce();
        chesse = factory.createCheese();
        pepperoni = factory.createPepperoni();
    }

}
