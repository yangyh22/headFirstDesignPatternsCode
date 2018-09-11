package chapter07_adapt_facade.adapt;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class MallardDuck implements Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
