package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class Quack implements QuackBehavior {

    public void quack() {
        // 呱呱叫
        System.out.println("gua gua ");
    }
}
