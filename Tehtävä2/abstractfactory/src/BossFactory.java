public class BossFactory extends AbstractFactory {
    Tuoteperhe tuoteperhe = new Tuoteperhe("boss");

    @Override
    public Vaate getVaate(String vaate) {
        if (vaate.equalsIgnoreCase("kengät")) {
            return new Kengat(tuoteperhe);
        } else if (vaate.equalsIgnoreCase("farkut")) {
            return new Farkut(tuoteperhe);
        } else if (vaate.equalsIgnoreCase("lippis")) {
            return new Lippis(tuoteperhe);
        } else if (vaate.equalsIgnoreCase("t-paita")) {
            return new TPaita(tuoteperhe);
        }
        return null;
    }
}