package de.gfn.playground.oop;

//import java.time.LocalDate;

public class Person { // Jede Klasse ist ein komplexer Datentyp
    
    // Instanzeigenschaften (nicht static) = Jedes Objekt hat seine eigenen
    // Instanzvariablen werden mit ihren Standardwerten initialisiert
    private String vorname; // Standardtyp für komplexe Typen = null
    private String nachname;
    //public LocalDate geburtsDatum;
    private int gewicht; // Standardtyp für int = 0, double = 0.0, boolean = false etc. 
    
    // Konstruktor ist eine Methode OHNE Rückgabetyp
    // Heißt IMMER wie die Klasse
    public Person() { // Leerer Konstruktor (Baut ein leeres Objekt)
    }

    // Ohne einen eigenen Konstruiktor, stellt Java einen parameterlosen Konstruktor bereit
    public Person(String vorname, String nachname, int gewicht) {
        // vorname = Lokale Variable/Parameter
        // this. vorname = Instanzeigenschaft
        // Lokale Variablen/Parameter überlagern gleichnamige Instanzvariablen
        this.vorname = vorname;
        this.nachname = nachname;
        this.gewicht = gewicht;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        if(gewicht > 0) // Negative Werte werden abgelehnt
            this.gewicht = gewicht;
    }

    // Beschreibt, wie eine Person in einen String konvertiert wird
    @Override
    public String toString() {
        return "Person [vorname=" + vorname + ", nachname=" + nachname + ", gewicht=" + gewicht + "]";
    }
}
