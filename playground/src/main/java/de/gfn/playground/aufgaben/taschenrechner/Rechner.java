package de.gfn.playground.aufgaben.taschenrechner;

public class Rechner {

    // Klassenvariable = ist in allen Methoden dieser Klasse sichtbar
    // private = nur innerhalb dieser Klasse sichtbar
    private static String protokoll = "";

    public static double add(double a, double b) {
        double erg = a + b;
        protokoll += a + " + " + b + " = " + erg + "\n";
        // protokoll = protokoll + a + " + " + b + " = " + erg + "\n";
        return erg;
    }

    public static double sub(double a, double b) {
        double erg = a - b;
        protokoll += a + " - " + b + " = " + erg + "\n";
        return erg;
    }

    public static double multi(double a, double b) {
        double erg = a * b;
        protokoll += a + " * " + b + " = " + erg + "\n";
        return erg;
    }

    public static double div(double a, double b) {
        double erg = a / b;
        protokoll += a + " / " + b + " = " + erg + "\n";
        return erg;
    }

    // Gibt den Inhalt des Protokolls an den Aufrufer zurück
    public static String getProtokoll() {
        return protokoll;
    }
}
