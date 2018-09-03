package chapter04_factrory.factory_method_parrern;

/**
 * @author yangyh
 * @date 2018/9/3
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        topings.add("Grated Reggiano Cheese");
    }
}
