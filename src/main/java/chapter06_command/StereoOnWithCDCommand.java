package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    public void undo() {
        stereo.off();
    }
}
