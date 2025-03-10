package de.gfn.playground;

public class FahrzeugTest {

    public static void main(String[] args) {

        // primitive Datentypen: byte, short, char, int, long, float, double, boolean
        // sind vordefiniert und können nur einen Wert aufnehmen und ihn wiedergeben.
        // werden kleingeschrieben
        int i = 100;
        i = 200;

        // Komplexe Datentypen
        // Werden durch eine Klasse beschrieben - beginnen mit Großbuchstaben
        // Können mehrere Informationen enthalten
        // Können Methoden enthalten
        // f1 = Name der Variable
        Fahrzeug f1 = new Fahrzeug(); // Baut aus der Klasse ein Objekt
        f1.marke = "VW";
        f1.modell = "ID.3"; // Zeichenketten werden in Java immer in "..." geschrieben
        f1.antrieb = /* Das ist mein Kommentar */ "Elektro";
        f1.baujahr = 2024;
        f1.kmStand = 0;
        f1.fahrbereit = true; // true oder false (in Java kleingeschrieben)
        f1.getInfo(); // Aufruf einer Methode

        //Fahrzeug f2 = 200; // Java weiß nicht, wofür die 200 im Fahrzeug verwendet werden soll.
        //Fahrzeug 200; // 200 wird als Name der Variable benutzt. Variablen dürfen nicht mit Zahlen beginnen.

        Fahrzeug f2 = new Fahrzeug();
        f2.marke = "Volvo";
        f2.modell = "V70"; // Zeichenketten werden in Java immer in "..." geschrieben
        f2.antrieb = /* Das ist mein Kommentar */ "Benzin";
        f2.baujahr = 2016;
        f2.kmStand = 100_000; // _ verändert nichts am Wert
        f2.fahrbereit = false; // true oder false (in Java kleingeschrieben)
        f2.getInfo(); // Aufruf einer Methode

        /* 
        Namen für Variablen: keine Sonderzeichen (außer $ und _), keine leerzeichen, keine Schlüßelwörter
        Dürfen nicht mit einer Zahl beginnen!
         */

        System.out.println("Marke: " + f1.marke);
        System.out.println("Baujahr: " + f1.baujahr);

        // End-of-line-Kommentare

        /* Miltiline-Kommentare */
    }
}