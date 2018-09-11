package chapter08_template;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public abstract class CaffineBerverageWithHook {

    final void perpareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring inti cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
