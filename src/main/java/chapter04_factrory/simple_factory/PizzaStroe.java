package chapter04_factrory.simple_factory;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class PizzaStroe {

    SimplePizzaFactory factory;

    public PizzaStroe(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.cratePizza(type);

        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
