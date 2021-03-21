package commanddesignpattern;

public class ACAutomationRemote {

    Command command;

    public ACAutomationRemote(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }

}
