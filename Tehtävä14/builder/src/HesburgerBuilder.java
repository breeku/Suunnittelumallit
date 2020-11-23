public class HesburgerBuilder {
    private String ainesosat = "";
    private Juusto juusto;
    private JäävuoriSalaatti jäävuoriSalaatti;
    private KanaPihvi kanaPihvi;
    private Sämpylä sämpylä;
    private Majoneesi majoneesi;
    private Tomaatti tomaatti;

    public HesburgerBuilder() {
    }

    public HesburgerBuilder withJuusto(Juusto juusto) {
        this.juusto = juusto;
        return this;
    }

    public HesburgerBuilder withJäävuoriSalaatti(JäävuoriSalaatti jäävuoriSalaatti) {
        this.jäävuoriSalaatti = jäävuoriSalaatti;
        return this;
    }

    public HesburgerBuilder withKanaPihvi(KanaPihvi kanaPihvi) {
        this.kanaPihvi = kanaPihvi;
        return this;
    }

    public HesburgerBuilder withSämpylä(Sämpylä sämpylä) {
        this.sämpylä = sämpylä;
        return this;
    }

    public HesburgerBuilder withMajoneesi(Majoneesi majoneesi) {
        this.majoneesi = majoneesi;
        return this;
    }

    public HesburgerBuilder withTomaatti(Tomaatti tomaatti) {
        this.tomaatti = tomaatti;
        return this;
    }

    public String getBurger() {
        if (juusto != null)
            ainesosat += juusto.getClass().getName() + " ";
        if (jäävuoriSalaatti != null)
            ainesosat += jäävuoriSalaatti.getClass().getName() + " ";
        ;
        if (kanaPihvi != null)
            ainesosat += kanaPihvi.getClass().getName() + " ";
        ;
        if (sämpylä != null)
            ainesosat += sämpylä.getClass().getName() + " ";
        ;
        if (majoneesi != null)
            ainesosat += majoneesi.getClass().getName() + " ";
        ;
        if (tomaatti != null)
            ainesosat += tomaatti.getClass().getName() + " ";
        ;
        return ainesosat;
    }
}