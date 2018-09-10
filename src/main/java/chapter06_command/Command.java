package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public interface Command {

    void execute();

    void undo();

}
