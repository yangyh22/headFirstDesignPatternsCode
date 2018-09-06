package chapter01_strategy;

/**
 * @author yangyh
 * @date 2018/9/6
 */
public class Squeak implements QuackBehavior {

    public void quack() {
        // 橡皮鸭的吱吱叫
        System.out.println("zizi");
    }
}
