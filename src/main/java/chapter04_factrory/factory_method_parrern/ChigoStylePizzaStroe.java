package chapter04_factrory.factory_method_parrern;


/**
 * 工厂模式
 *
 * @author yangyh
 * @date 2018/9/3
 */
public class ChigoStylePizzaStroe extends PizzaStroe {

    public Pizza cratePizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepproni")) {
            pizza = new ChicagoStyleCheesePizza();// 意思一下没具体写
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleCheesePizza();// 意思一下没具体写
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleCheesePizza();// 意思一下没具体写
        }
        return pizza;

    }
}
