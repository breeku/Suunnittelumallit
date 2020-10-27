public class Lippis extends Vaate {
    public Lippis(Tuoteperhe tuoteperhe) {
        super(tuoteperhe, "lippis");
    }

    @Override
    public String toString() {
        return "Lippis: " + tuoteperhe;
    }
}
