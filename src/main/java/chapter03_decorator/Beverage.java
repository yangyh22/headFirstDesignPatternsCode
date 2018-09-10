package chapter03_decorator;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public abstract class Beverage {

    String description = "Unknown Berverage";

    boolean milk;

    boolean soy;

    boolean mocha;

    boolean whip;

    public String getDescription(){
        return description;
    }

    abstract double cost();

}
