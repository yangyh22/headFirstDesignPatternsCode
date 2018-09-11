package chapter07_adapt_facade;



/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Test {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck trukeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says.....");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says...");
        duck.quack();
        duck.fly();

        System.out.println("the trukeyAdapter says...");
        trukeyAdapter.quack();
        trukeyAdapter.fly();

    }
}
