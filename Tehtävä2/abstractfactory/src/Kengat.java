public class Kengat extends Vaate {
    public Kengat(Tuoteperhe tuoteperhe) {
        super(tuoteperhe, "kengät");
    }

    @Override
    public String toString() {
        return "Kengät: " + tuoteperhe;
    }
}
