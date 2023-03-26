package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.Espresso;
import decorator.toppings.Mocha;
import decorator.toppings.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        //Espresso
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        //Dark roast coffee with double milk and whip
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
