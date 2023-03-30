package factory;

import factory.ingredients.*;

import java.util.List;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Chesse createCheese();
    public List<Veggies> createVeggies();
    public Clams createClams();
}
