package factory;

import factory.chicago.ChicagoPizzaStore;
import factory.nyc.NYCPizzaStore;

public class Pizzeria {
    public static void main(String[] args) {
        PizzaStore nycPizzaStore = new NYCPizzaStore();
        nycPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("pepperoni");
    }
}
