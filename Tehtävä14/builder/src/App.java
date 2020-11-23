import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Juusto juusto = new Juusto();
        JäävuoriSalaatti jäävuoriSalaatti = new JäävuoriSalaatti();
        KanaPihvi kanaPihvi = new KanaPihvi();
        Majoneesi majoneesi = new Majoneesi();
        Sämpylä sämpylä = new Sämpylä();
        Tomaatti tomaatti = new Tomaatti();

        McDonaldsBuilder mcDonaldsBurger = new McDonaldsBuilder().withTomaatti(tomaatti).withJuusto(juusto)
                .withJäävuoriSalaatti(jäävuoriSalaatti).withMajoneesi(majoneesi).withKanaPihvi(kanaPihvi)
                .withSämpylä(sämpylä);
        List<Object> eka = mcDonaldsBurger.getBurger();

        System.out.println("Mcdonalds burger:");
        for (Object ainesosa : eka) {
            System.out.println(ainesosa.getClass().getName());
        }

        HesburgerBuilder hesburgerBurger = new HesburgerBuilder().withTomaatti(tomaatti).withJuusto(juusto)
                .withJäävuoriSalaatti(jäävuoriSalaatti).withMajoneesi(majoneesi).withKanaPihvi(kanaPihvi)
                .withSämpylä(sämpylä);
        String toka = hesburgerBurger.getBurger();

        System.out.println("Hesburger burger:");
        System.out.println(toka);

    }
}
