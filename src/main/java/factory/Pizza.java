package factory;

import factory.ingredients.*;

import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<Veggies> veggies;
    Chesse chesse;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes");
    };
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };
    public void box(){
        System.out.println("Place pizza in official box");
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
