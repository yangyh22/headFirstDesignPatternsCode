package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class FlyNoWay implements FlyBahavior {

    public void fly() {
        // 不会飞
        System.out.println("i can not fly");
    }
}
