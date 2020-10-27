public class TPaita extends Vaate {
    public TPaita(Tuoteperhe tuoteperhe) {
        super(tuoteperhe, "t-paita");
    }

    @Override
    public String toString() {
        return "TPaita: " + tuoteperhe;
    }
}
