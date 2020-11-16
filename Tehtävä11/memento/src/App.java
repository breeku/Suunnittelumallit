public class App {
    public static void main(String[] args) throws Exception {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas asiakas = new Asiakas(arvuuttaja, "Matias");
        asiakas.start();
    }
}
