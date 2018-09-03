package chapter04_factrory.simple_factory;

/**
 * 简单工厂，不是设计模式，是一种编程习惯
 *
 * @author yangyh
 * @date 2018/9/3
 */
public class SimplePizzaFactory {

    public Pizza cratePizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepproni")){
            pizza  = new PepproniPizza();
        }else if(type.equals("clam")){
            pizza  = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;

    }
}
