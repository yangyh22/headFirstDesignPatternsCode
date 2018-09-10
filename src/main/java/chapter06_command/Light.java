package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Light {

    String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name+"Light is On");
    }

    void off(){
        System.out.println(name+"Light is Off");
    }

}
