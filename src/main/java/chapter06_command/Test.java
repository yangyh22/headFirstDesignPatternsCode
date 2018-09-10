package chapter06_command;

/**
 * @author yangyh
 * @date 2018/9/10
 */
public class Test {

    public static void main(String[] args) {
        {
            SimpleRemoteControl remote = new SimpleRemoteControl();
            Light light = new Light();
            LightOnCommand lightOn = new LightOnCommand(light);

            remote.setCommand(lightOn);
            remote.buttonWasPressed();
        }

        {
            RemoteControl remoteControl = new RemoteControl();

            Light liveRoomLight = new Light("Living Room");
            Light kitchenLight = new Light("kitchen");

            final LightOnCommand lightOnCommand = new LightOnCommand(liveRoomLight);
            final LightOffCommand lightOffCommand = new LightOffCommand(liveRoomLight);
            final LightOnCommand lightOnCommand1 = new LightOnCommand(kitchenLight);
            final LightOffCommand lightOffCommand1 = new LightOffCommand(kitchenLight);

            remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
            remoteControl.setCommand(1,lightOnCommand1,lightOffCommand1);
            System.out.println(remoteControl);

            remoteControl.onButtonWasPushed(1);
            remoteControl.onButtonWasPushed(1);

        }

    }
}
