package chapter04_factory.factory_method_parrern;


/**
 *  创造者类
 * @author yangyh
 * @date 2018/9/3
 */
public abstract class PizzaStroe {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = cratePizza(type);

        pizza.prepare();
        ;
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    abstract Pizza cratePizza(String type);
}
