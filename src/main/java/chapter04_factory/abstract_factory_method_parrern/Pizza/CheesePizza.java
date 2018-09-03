package chapter04_factory.abstract_factory_method_parrern.Pizza;

import chapter04_factory.abstract_factory_method_parrern.Ingredient.PizzaIngredientFactory;
import chapter04_factory.factory_method_parrern.ChicagoStyleCheesePizza;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
