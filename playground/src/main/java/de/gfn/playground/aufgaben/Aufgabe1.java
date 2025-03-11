package de.gfn.playground.aufgaben;

public class Aufgabe1 {

    /*
    Schreibe eine Klasse mit einer main-Methode
    Definiere darin für jeden primitiven Datentyp eine Variable und weise ihr einen passenden Wert zu.
    Beachte bei der Benennung die Namenskonventionen und verwende sprechende Bezeichner.

    Definiere zusätzlich zwei String Variablen (vorname und nachname).
    Gebe anschließen diese variablen verknüpft in einer Zeile aus.

    Schreibe anschließend 4 Methoden für die 4 Grundrechenarten und rufe sie in der main-Methode auf.

    Wiederhole die heutigen Inhalte.
     */

    public static void main(String[] args) {
        
        byte minByte = Byte.MIN_VALUE;
        Byte minByteObj = minByte; // Autoboxing: primitiver byte wird zu einem Byte Wrapper-Objekt
        
        // byte < short < int < long < float < double
        //         char <

        // kleinere Typen können immer in größere abgelegt werden: primitive widening
        // größere Typen können nicht automatisch in kleinere abgelegt werden. Kann nur mit einem Cast erfolgen

        byte b1 = 127;
        b1 = (byte)2000;
        System.out.println(b1);

        // byte und short werden beim rechnen automatisch zu int angehoben

        short s1 = 32_000;
        int i1 = -25;
        long l1 = 4_500_000_000L; // bei einem long muss immer ein L dazu. Ohne l wird es als int betrachtet

        long l2;
        l2 = 100; // primitive Widening von int auf long

        float f1 = 10.5F; // Bei float muss das F mit dazu
        double d1 = 10.5;

        // int ist der Standardtyp für Ganzzahlen
        // double ist der Standardtyp für Fließkommazahlen
    
        boolean b2 = false;
        boolean b3 = b2; // b2 und b3 sind zwei getrennte Variablen mit zwei Werten auf dem Stack
        char c1 = 'x'; // ein Unicode-Zeichen
        System.out.println((char)3232);

        String text = "Das ist das Haus von Nikigraus";
        System.out.println(text.charAt(5));

        // Bei lokalen Variablen primitiver Datentypen liegt die Variable und Wert auf dem Stack
        // Bei lokalen Variablen komplexer Datentypen liegt die Variable als Zeiger auf dem Stack, das Objekt dahinter liegt auf dem Heap

        String vorname = "Peter"; // String Literal Pool wird verwendet
        String nachname = new String("Parker"); // hier wird IMMER ein neues Objekt erzeugt

        String vorname2 = "Peter"; // String wird aus dem Pool verwendet

        String s2 = vorname; // vorname und s2 zeigen auf das gleiche Objekt auf dem Heap

        System.out.println(); // produziert eine neue Zeile
        System.out.println(vorname + " " + nachname);
        System.out.print(vorname);
        System.out.print(nachname); // Produziert keinen Zeilenumbruch
        System.out.println();

        // Konstante
        final String VORLAGE = "Mein Name ist %s %s. Ich bin %d Jahre alt. Mein Kontostand ist %.2f € \n";
        //VORLAGE = "bla bla bla"; // Error: Konstante darf nach der ersten Zuweisung nicht mehr verändert werden

        // Vorlage wird ausgefüllt und auf der Konsole ausgegeben
        System.out.printf(VORLAGE, vorname, nachname, 100, 10.5); // Vorlage und Werte

        // Vorlage wird ausgefüllt und als String zurückgegeben
        String ausgefuellt = VORLAGE.formatted(vorname, nachname, 100, 10.5);
        System.out.println(ausgefuellt);

        System.out.println(add(10, 15.5));

        double erg = sub(100, 52);
        System.out.println(erg);

        multi(20, 25);
        // hier ist das Erg der Methode schon weg

        double box = multi(20, 25);
        // das Erg der Methode ist in der Variable box verfügbar
    }

    // Funktionen die in einer Klasse definiert sind nennt man Methoden
    // Freie Funktionen gibt es in Java nicht!!!!!

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
