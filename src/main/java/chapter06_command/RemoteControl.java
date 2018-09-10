package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command command = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = command;
            offCommands[i] = command;
        }
        undoCommand = new NoCommand();

    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----- Remote Control ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[Slot " + i + "]" + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
