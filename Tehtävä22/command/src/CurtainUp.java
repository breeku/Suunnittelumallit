public class CurtainUp implements Command {
    private Curtain curtain;

    public CurtainUp(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override // Command
    public void execute() {
        curtain.pullUp();
    }
}
