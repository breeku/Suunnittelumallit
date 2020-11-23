import java.util.ArrayList;
import java.util.List;

public class McDonaldsBuilder {
    private List<Object> ainesosat = new ArrayList<Object>();
    private Juusto juusto;
    private JäävuoriSalaatti jäävuoriSalaatti;
    private KanaPihvi kanaPihvi;
    private Sämpylä sämpylä;
    private Majoneesi majoneesi;
    private Tomaatti tomaatti;

    public McDonaldsBuilder() {
    }

    public McDonaldsBuilder withJuusto(Juusto juusto) {
        this.juusto = juusto;
        return this;
    }

    public McDonaldsBuilder withJäävuoriSalaatti(JäävuoriSalaatti jäävuoriSalaatti) {
        this.jäävuoriSalaatti = jäävuoriSalaatti;
        return this;
    }

    public McDonaldsBuilder withKanaPihvi(KanaPihvi kanaPihvi) {
        this.kanaPihvi = kanaPihvi;
        return this;
    }

    public McDonaldsBuilder withSämpylä(Sämpylä sämpylä) {
        this.sämpylä = sämpylä;
        return this;
    }

    public McDonaldsBuilder withMajoneesi(Majoneesi majoneesi) {
        this.majoneesi = majoneesi;
        return this;
    }

    public McDonaldsBuilder withTomaatti(Tomaatti tomaatti) {
        this.tomaatti = tomaatti;
        return this;
    }

    public List<Object> getBurger() {
        if (juusto != null)
            ainesosat.add(juusto);
        if (jäävuoriSalaatti != null)
            ainesosat.add(jäävuoriSalaatti);
        if (kanaPihvi != null)
            ainesosat.add(kanaPihvi);
        if (sämpylä != null)
            ainesosat.add(sämpylä);
        if (majoneesi != null)
            ainesosat.add(majoneesi);
        if (tomaatti != null)
            ainesosat.add(tomaatti);
        return ainesosat;
    }
}
