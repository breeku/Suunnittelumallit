public class Farkut extends Vaate {
    public Farkut(Tuoteperhe tuoteperhe) {
        super(tuoteperhe, "farkut");
    }

    @Override
    public String toString() {
        return "Farkut: " + tuoteperhe;
    }
}
