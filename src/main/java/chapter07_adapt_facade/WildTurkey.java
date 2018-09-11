package chapter07_adapt_facade;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("gobble");
    }

    public void fly() {
        System.out.println("I am flying a shot distance");
    }
}
