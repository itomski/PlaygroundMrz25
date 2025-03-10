// Konvention für Packages: umgedrehte domain des unternehmens + Projektname 
package de.gfn.playground;

// Klasse
public class Main {

    // PascalCase: Klassennamen
    // camelCase: Variablen und Methoden()
    // snake_case: Wird in Java nicht verwendet
    // SCREAMING_SNAKE_CASE: öffentliche Konstanten

    // main-Methode ist der Einstiegspunkt für das Programm
    // public = öffentliche Sichtbarkeit
    // static = Methode kann direkt auf dem Bauplan/Klasse ausgeführt werden (ein Objekt wird nicht benötigt)
    // void = Rückgabetyp, hier Nichts
    // main = Name der Methode
    // () Parameter für die Ausführung
    public static void main(String[] args) {
        
        String s = "Hallo Java";

        // System = Klasse
        // out = Variable
        // println = Methode
        System.out.println(s);

        s = "Hallo Ende";

        System.out.println(s);

        int maxSpeed; // Lokale Variable muss vor der Verwendung initialisiert werden
        // System.out.println(maxSpeed);

        int sum = add(20, 30);
        System.out.println("Die Summe ist " + sum);

    }

    // Methode
    public static int add(int a, int b) {
        return a + b; // Rückgabe an den Aufrufer der Methode
    }
}