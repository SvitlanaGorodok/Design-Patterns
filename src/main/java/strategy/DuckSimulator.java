package strategy;

import strategy.ducks.Duck;
import strategy.ducks.DuckDecoy;
import strategy.ducks.ModelDuck;
import strategy.ducks.WildDuck;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyRocketPowered;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.setQuackBehavior(new Quack());
        wildDuck.setFlyBehavior(new FlyWithWings());
        wildDuck.perform();
        System.out.println("---------------");
        Duck modelDuck = new ModelDuck();
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perform();
        System.out.println("---------------");
        Duck duckDecoy = new DuckDecoy();
        duckDecoy.setFlyBehavior(new FlyNoWay());
        duckDecoy.setQuackBehavior(new Quack());
        duckDecoy.perform();
    }
}
