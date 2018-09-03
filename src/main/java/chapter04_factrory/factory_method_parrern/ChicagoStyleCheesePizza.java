package chapter04_factrory.factory_method_parrern;


/**
 * @author yangyh
 * @date 2018/9/3
 */
public class ChicagoStyleCheesePizza extends  Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough =  "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        topings.add("Shredded Mozzarrella Cheese");
    }

    public void cut() {
        System.out.println("Cuuting the pizza into square slices");
    }


}
