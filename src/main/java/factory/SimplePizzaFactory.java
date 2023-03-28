package factory;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesePizza();
        } else if (type.equals("pepperoni")){
            return new PepperoniPizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        }
        return null;
    }
}
