class Tietokanta {
    private static Tietokanta db;

    private Tietokanta() {
    }

    public static Tietokanta getInstance() {
        if (db == null) {
            db = new Tietokanta();
        }

        return db;
    }

    public void getConnection() {
        System.out.println("Yhteys luotu.");
    }
}
