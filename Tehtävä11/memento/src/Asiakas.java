import java.util.Random;

public class Asiakas extends Thread {
    private Arvuuttaja arvuuttaja;
    private Memento memento;
    private String nimi;
    private Integer arvaukset = 0;

    public Asiakas(Arvuuttaja arvuuttaja, String nimi) {
        this.arvuuttaja = arvuuttaja;
        this.nimi = nimi;

        memento = arvuuttaja.liityPeliin(this);
    }

    public void run() {
        while (true) {
            Integer luku = new Random().nextInt(10);
            arvaukset++;
            if (arvuuttaja.tarkista(memento, luku)) {
                System.out.println(nimi + " arvasi oikein: " + luku + "\n" + "arvauksia: " + arvaukset);
                arvaukset = 0;
                break;
            }
            System.out.println(nimi + " arvasi väärin: " + luku + "\n" + "arvauksia: " + arvaukset);
        }

    }
}
