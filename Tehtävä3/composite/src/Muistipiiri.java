public class Muistipiiri implements Laiteosa {
    private double hinta;

    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }

    public double getHinta() {
        return this.hinta;
    }

    public String laiteNimi() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.laiteNimi() + " hinta: " + this.hinta;
    }
}
