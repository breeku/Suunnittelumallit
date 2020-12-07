public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}
