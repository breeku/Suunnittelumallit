public abstract class RaiseProcessor {
    public RaiseProcessor nextProcessor;

    public RaiseProcessor(RaiseProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorizedToGiveRaise(Double percentage);
}