package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        // 不会叫
        System.out.println("mute");
    }
}
