public class App {
    public static void main(String[] args) throws Exception {
        Henkilo Jasper = new Henkilo("Jasper");

        AbstractFactory vaateTehdas = FactoryProducer.getFactory(Jasper.valmistunut());
        Jasper.pue(vaateTehdas.getVaate("kengät"));
        Jasper.pue(vaateTehdas.getVaate("farkut"));
        Jasper.pue(vaateTehdas.getVaate("lippis"));
        Jasper.pue(vaateTehdas.getVaate("t-paita"));

        System.out.println(Jasper.lueVaatteet());

        Jasper.valmistu();

        vaateTehdas = FactoryProducer.getFactory(Jasper.valmistunut());
        Jasper.pue(vaateTehdas.getVaate("kengät"));
        Jasper.pue(vaateTehdas.getVaate("farkut"));
        Jasper.pue(vaateTehdas.getVaate("lippis"));
        Jasper.pue(vaateTehdas.getVaate("t-paita"));

        System.out.println(Jasper.lueVaatteet());
    }
}
