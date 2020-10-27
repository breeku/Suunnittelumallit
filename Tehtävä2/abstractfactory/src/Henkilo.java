public class Henkilo {
    private String nimi;
    private Farkut farkut;
    private Kengat kengat;
    private Lippis lippis;
    private TPaita tPaita;
    private boolean valmistunut;
    
    public Henkilo(String nimi) {
        this.nimi = nimi;
    }

    public void pue(Vaate vaate) {
        if (vaate.getVaate().equals("farkut") ) {
            this.farkut = (Farkut) vaate;
        } else if (vaate.getVaate().equals("kengät")) {
            this.kengat = (Kengat) vaate;
        } else if (vaate.getVaate().equals("lippis")) {
            this.lippis = (Lippis) vaate;
        } else if (vaate.getVaate().equals("t-paita")) {
            this.tPaita = (TPaita) vaate;
        }
    }

    public void valmistu() {
        this.valmistunut = true;
    }

    public boolean valmistunut() {
        return this.valmistunut;
    }

    public String lueVaatteet() {
        return "Nimeni on " + nimi + ". " + (valmistunut ? "Olen valmistunut insinööriksi. \n" : "En ole valmistunut insinööriksi. \n") + "Päälläni on: \n"
         + farkut.toString() + ", \n"
          + kengat.toString() + ", \n"
           + lippis.toString() + ", \n"
            + tPaita.toString();
    }
}
