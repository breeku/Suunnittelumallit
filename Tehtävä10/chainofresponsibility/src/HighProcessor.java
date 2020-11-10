public class HighProcessor extends RaiseProcessor {

    public HighProcessor(RaiseProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorizedToGiveRaise(Double percentage) {
        if (percentage > 5) {
            System.out.println("High processor grants raise of " + percentage + "%");
            return true;
        } else {
            System.out.println("?");
            return false;
        }
    }

}
