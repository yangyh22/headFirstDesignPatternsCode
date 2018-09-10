package chapter05_singleton;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class ChocolateBoiler {

    boolean empty;
    boolean boiled;

    private static ChocolateBoiler uniqueInstance;


    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public ChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // 在锅炉里填满巧克力和牛奶的混合物
        }
    }

    void drain(){
        if(!isEmpty() && isBoiled()){
            // 排出煮沸的巧克力和牛奶
            empty  = true;
        }
    }

    void boil (){
        if(!isEmpty() && !isBoiled()){
            // 将炉内物煮沸
            boiled  = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }


}
