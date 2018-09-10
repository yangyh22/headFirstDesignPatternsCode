package chapter03_decorator;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    double cost() {
        return 1.99;
    }
}
