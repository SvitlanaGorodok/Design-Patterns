package factory;

import factory.ingredients.*;

import java.util.List;

public interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Chesse createCheese();
    public List<Veggies> createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
