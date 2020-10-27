public abstract class Vaate {
    public Tuoteperhe tuoteperhe;
    public String vaate;

    public Vaate(Tuoteperhe tuoteperhe, String vaate) {
        this.tuoteperhe = tuoteperhe;
        this.vaate = vaate;
    }

    public Tuoteperhe getTuoteperhe() {
        return tuoteperhe;
    }

    public String getVaate() {
        return vaate;
    }
}
