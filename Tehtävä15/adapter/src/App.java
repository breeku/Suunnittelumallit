public class App {
    public static void main(String[] args) throws Exception {
        Movable lada = new Lada();
        MovableAdapter ladaAdapter = new MovableAdapterImplementation(lada);

        System.out.println(ladaAdapter.getSpeed());
    }
}
