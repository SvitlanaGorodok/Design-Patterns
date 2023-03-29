package factory.nyc;

import factory.*;

public class NYCPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            return new NYCStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYCStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYCStyleVeggiePizza();
        }
        return null;
    }
}
