package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class FlyWithWings implements FlyBahavior {

    public void fly() {
        // 实现鸭子飞行
        System.out.println("I am flying ");
    }
}
