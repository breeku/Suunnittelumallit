public class App {
    public static void main(String[] args) throws Exception {
        RaiseProcessor chain = new LowProcessor(new MediumProcessor(new HighProcessor(null)));

        chain.isAuthorizedToGiveRaise(1.5);
        System.out.println("");
        chain.isAuthorizedToGiveRaise(3.5);
        System.out.println("");
        chain.isAuthorizedToGiveRaise(5.5);
    }
}
