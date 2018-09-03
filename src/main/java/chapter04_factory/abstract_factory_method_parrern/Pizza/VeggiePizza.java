package chapter04_factory.abstract_factory_method_parrern.Pizza;

import chapter04_factory.abstract_factory_method_parrern.Ingredient.PizzaIngredientFactory;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
