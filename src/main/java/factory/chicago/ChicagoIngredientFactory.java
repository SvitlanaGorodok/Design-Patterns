package factory.chicago;

import factory.IngredientFactory;
import factory.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Chesse createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggies.add(new EggPlant());
        veggies.add(new Spinach());
        veggies.add(new BlackOlives());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }
}
