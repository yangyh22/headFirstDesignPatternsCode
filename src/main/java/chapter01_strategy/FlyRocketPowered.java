package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class FlyRocketPowered implements FlyBahavior{

    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
