public class App {
    public static void main(String[] args) throws Exception {
        Laiteosa muistipiiri = new Muistipiiri(120);
        Laiteosa näytönohjain = new Näytönohjain(600);
        Laiteosa prosessori = new Prosessori(300);

        Emolevy emolevy = new Emolevy(250);
        emolevy.lisääOsa(muistipiiri);
        emolevy.lisääOsa(näytönohjain);
        emolevy.lisääOsa(prosessori);

        Kotelo kotelo = new Kotelo(200);
        kotelo.lisääOsa(emolevy);

        System.out.println(kotelo.toString());

        System.out.println("Kokoonpanon yhteishinta: ");
        System.out.println(kotelo.getHinta());
    }
}
