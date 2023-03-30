package factory.chicago;

import factory.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        ChicagoIngredientFactory factory = new ChicagoIngredientFactory();

        if(type.equals("cheese")){
            pizza = new PizzaCheese(factory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("pepperoni")){
            pizza = new PizzaPepperoni(factory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new PizzaClam(factory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new PizzaVeggie(factory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}
