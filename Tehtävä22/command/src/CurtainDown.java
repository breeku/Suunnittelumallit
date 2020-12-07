public class CurtainDown implements Command {
    private Curtain curtain;

    public CurtainDown(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override // Command
    public void execute() {
        curtain.putDown();
    }
}
