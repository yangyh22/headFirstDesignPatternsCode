package chapter04_factory.abstract_factory_method_parrern.Ingredient;

/**
 * 纽约风味原料工厂
 *
 * @author yangyh
 * @date 2018/9/3
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Viggies[] createViggies() {
        Viggies[] viggies = {new Garlic(),new Onion(),new Mushroom(),new RedPapper()};
        return viggies;
    }

    public Pepperonri createPepperonri() {
        return new SlicedPepperonri();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
