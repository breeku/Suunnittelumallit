public class Tuoteperhe {
    private String merkki;
    
    public Tuoteperhe(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki;
    }
}
