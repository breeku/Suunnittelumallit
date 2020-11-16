import java.util.Random;

public class Arvuuttaja {

    public synchronized Memento liityPeliin(Asiakas asiakas) {
        return new Memento(new Random().nextInt(10));
    }

    public synchronized boolean tarkista(Memento memento, int arvaus) {
        return memento.getArvaus() == arvaus;
    }
}