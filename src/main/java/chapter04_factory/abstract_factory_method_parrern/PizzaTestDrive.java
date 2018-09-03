package chapter04_factory.abstract_factory_method_parrern;

import chapter04_factory.abstract_factory_method_parrern.Ingredient.NYPizzaIngredientFactory;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.PizzaIngredientFactory;
import chapter04_factory.abstract_factory_method_parrern.Pizza.CheesePizza;
import chapter04_factory.abstract_factory_method_parrern.Pizza.NYPizzaStore;
import chapter04_factory.abstract_factory_method_parrern.Pizza.Pizza;
import chapter04_factory.abstract_factory_method_parrern.Pizza.PizzaStroe;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStroe nyPizzaStroe = new NYPizzaStore();

        Pizza pizza = nyPizzaStroe.orderPizza("cheese");
        pizza.toString();
    }

}
