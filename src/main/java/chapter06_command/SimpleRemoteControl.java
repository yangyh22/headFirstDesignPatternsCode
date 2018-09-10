package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class SimpleRemoteControl {

    // 插槽
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    void buttonWasPressed(){
        slot.execute();
    }
}
