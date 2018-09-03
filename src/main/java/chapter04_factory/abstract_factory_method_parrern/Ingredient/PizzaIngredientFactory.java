package chapter04_factory.abstract_factory_method_parrern.Ingredient;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Viggies[] createViggies();

    public Pepperonri createPepperonri();

    public Clams createClams();

}
