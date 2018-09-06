package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class Test {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBahavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
