package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public abstract class Duck {

    FlyBahavior flyBahavior;

    QuackBehavior quackBehavior;

    public void setFlyBahavior(FlyBahavior flyBahavior) {
        this.flyBahavior = flyBahavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBahavior.fly();
    }

    void swim() {
        System.out.println("all ducks float, even deoys");
    }

    void display() {

    }

}
