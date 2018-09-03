package chapter04_factrory.factory_method_parrern;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStroe nyStroe = new NYStylePizzaStroe();
        PizzaStroe chicagoStroe = new ChigoStylePizzaStroe();

        Pizza pizza = nyStroe.orderPizza("cheese");
        System.out.println("Ethan ordered a cheese pizza");
        System.out.println();

        pizza = chicagoStroe.orderPizza("cheese");
        System.out.println("jole ordered a cheese pizza");
    }

}
