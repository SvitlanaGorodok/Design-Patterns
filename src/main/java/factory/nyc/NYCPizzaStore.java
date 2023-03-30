package factory.nyc;

import factory.*;

public class NYCPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        NYCIngredientFactory factory = new NYCIngredientFactory();
        if(type.equals("cheese")){
            pizza = new PizzaCheese(factory);
            pizza.setName("NYC Style Cheese Pizza");
        } else if (type.equals("pepperoni")){
            pizza = new PizzaPepperoni(factory);
            pizza.setName("NYC Style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new PizzaClam(factory);
            pizza.setName("NYC Style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new PizzaVeggie(factory);
            pizza.setName("NYC Style Veggie Pizza");
        }
        return pizza;
    }
}
