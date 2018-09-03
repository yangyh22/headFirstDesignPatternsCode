package chapter04_factory.abstract_factory_method_parrern.Pizza;

import chapter04_factory.abstract_factory_method_parrern.Ingredient.NYPizzaIngredientFactory;
import chapter04_factory.abstract_factory_method_parrern.Ingredient.PizzaIngredientFactory;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class NYPizzaStore extends PizzaStroe {

    Pizza cratePizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
