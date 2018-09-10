package chapter03_decorator;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$"+beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "$"+beverage2.cost());
    }
}
