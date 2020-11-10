public class MediumProcessor extends RaiseProcessor {

    public MediumProcessor(RaiseProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorizedToGiveRaise(Double percentage) {
        if (percentage > 2 && percentage < 5) {
            System.out.println("Medium processor grants raise of " + percentage + "%");
            return true;
        } else {
            System.out.println("Medium processor asks high processor");
            return this.nextProcessor.isAuthorizedToGiveRaise(percentage);
        }
    }

}
