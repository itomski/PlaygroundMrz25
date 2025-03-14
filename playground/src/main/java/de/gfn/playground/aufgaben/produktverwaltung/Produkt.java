package de.gfn.playground.aufgaben.produktverwaltung;

public class Produkt {

    // Instanzeigenschaften
    private int nummer;
    private String name;
    private String beschreibung;
    private double preis;
    private boolean verfuegbar;

    public Produkt(int nummer, String name, String beschreibung, double preis, boolean verfuegbar) {
        // Objekteigenschaft wird durch Konstruktorparameter belegt
        this.nummer = nummer;
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.verfuegbar = verfuegbar;
    }

    public Produkt(int nummer, String name, String beschreibung, double preis) {
        this.nummer = nummer;
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
    }

    public Produkt() { // Baut ein leeres Objekt
    }

    public int getNummer() { // Lesen
        return nummer;
    }
    public void setNummer(int nummer) { // Schreiben
        this.nummer = nummer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public boolean isVerfuegbar() {
        return verfuegbar;
    }
    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }

    @Override
    public String toString() {
        return "Produkt [nummer=" + nummer + ", name=" + name + ", beschreibung=" + beschreibung + ", preis=" + preis
                + ", verfuegbar=" + verfuegbar + "]";
    }
}
