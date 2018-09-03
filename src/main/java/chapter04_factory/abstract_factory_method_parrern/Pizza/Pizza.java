package chapter04_factory.abstract_factory_method_parrern.Pizza;

import chapter04_factory.abstract_factory_method_parrern.Ingredient.Cheese;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.Clams;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.Dough;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.Pepperonri;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.Sauce;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.Viggies;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 *
 * @author yangyh
 * @date 2018/9/3
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Viggies viggies[];
    Cheese cheese;
    Pepperonri pepperonri;
    Clams clams;

    abstract void prepare();

    List<String> topings = new ArrayList<String>();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cuuting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Pllace in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
