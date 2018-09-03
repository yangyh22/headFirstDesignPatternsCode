package chapter04_factrory.factory_method_parrern;

/**
 * 工厂模式
 *
 * @author yangyh
 * @date 2018/9/3
 */
public class NYStylePizzaStroe extends PizzaStroe {

    Pizza cratePizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepproni")) {
            pizza = new NYStyleCheesePizza(); // 意思一下没具体写
        } else if (type.equals("clam")) {
            pizza = new NYStyleCheesePizza();// 意思一下没具体写
        } else if (type.equals("veggie")) {
            pizza = new NYStyleCheesePizza();// 意思一下没具体写
        }
        return pizza;

    }
}
