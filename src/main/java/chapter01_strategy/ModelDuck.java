package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class ModelDuck extends  Duck {

    public ModelDuck() {
        flyBahavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I am a model duck");
    }


}
