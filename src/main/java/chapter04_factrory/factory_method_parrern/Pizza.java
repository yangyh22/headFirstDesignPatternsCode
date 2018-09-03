package chapter04_factrory.factory_method_parrern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> topings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (String toping : topings) {
            System.out.println(toping);
        }

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cuuting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Pllace in official PizzaStore box");
    }

    // public Pizza(String name) {
    //     this.name = name;
    // }
}
