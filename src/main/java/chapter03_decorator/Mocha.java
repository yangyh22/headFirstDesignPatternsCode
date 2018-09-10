package chapter03_decorator;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Mocha extends Condiment {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    double cost() {
        return .20 + beverage.cost();
    }
}
