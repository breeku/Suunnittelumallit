import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
    private double hinta;
    private List<Laiteosa> osat;

    public Emolevy(double hinta) {
        this.hinta = hinta;
        this.osat = new ArrayList<>();
    }

    public void lisääOsa(Laiteosa osa) {
        osat.add(osa);
    }

    public void poistaOsa(Laiteosa osa) {
        osat.remove(osa);
    }

    public double getHinta() {
        double hinta = this.hinta;
        for (Laiteosa osa : osat) {
            hinta += osa.getHinta();
        }
        return hinta;
    }

    public String laiteNimi() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        String osatString = "";
        for (Laiteosa osa : osat) {
            osatString += osa.toString();
            osatString += "\n";
        }
        return this.laiteNimi() + " hinta: " + this.hinta + ".\nEmolevyssä on kiinni seuraavat osat: \n" + osatString;
    }
}
