package study.command;

public class CommandPatternMain {

    public static void main(String[] args) {
        // Receiver 객체 생성
        Light light = new Light();
        
        // Command 객체 생성
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker 객체 생성
        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
