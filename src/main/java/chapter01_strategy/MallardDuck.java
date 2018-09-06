package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBahavior = new FlyWithWings();
    }

    void display() {
    // 外观是绿头
        System.out.println("I am a real Mallard duck");
    }

}
