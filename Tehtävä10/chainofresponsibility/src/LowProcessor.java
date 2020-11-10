public class LowProcessor extends RaiseProcessor {

    public LowProcessor(RaiseProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorizedToGiveRaise(Double percentage) {
        if (percentage < 2) {
            System.out.println("Low processor grants raise of " + percentage + "%");
            return true;
        } else {
            System.out.println("Low processor asks medium processor");
            return this.nextProcessor.isAuthorizedToGiveRaise(percentage);
        }
    }

}
