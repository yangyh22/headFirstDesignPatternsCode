package chapter08_template;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public class Coffee extends CaffineBerverage {

    @Override
    void brew() {
        System.out.println("brew Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("addCondiments tea");
    }
}

