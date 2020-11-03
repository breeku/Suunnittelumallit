public class App {
    public static void main(String[] args) throws Exception {
        Tietokanta db1 = Tietokanta.getInstance();

        db1.getConnection();
    }
}