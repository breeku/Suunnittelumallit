public class App {
    public static void main(String[] args) throws Exception {
        Curtain curtain = new Curtain();
        Command putDown = new CurtainDown(curtain);
        Command pullUp = new CurtainUp(curtain);
        Button button1 = new Button(putDown);
        Button button2 = new Button(pullUp);
        button1.push();
        button2.push();
    }
}
