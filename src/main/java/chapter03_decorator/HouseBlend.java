package chapter03_decorator;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend coffee ";
    }

    double cost() {
        return .99;
    }
}
