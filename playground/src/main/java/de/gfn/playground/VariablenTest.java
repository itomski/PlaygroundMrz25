package de.gfn.playground;

public class VariablenTest {
    
    // Klassenvariable: Können in allen static Methoden dieser Klasse benutzt werden
    // Sind ab dem laden der Klasse bis zum Ende des Programms verfügbar
    private static int staticZahl = 500;

    // Instanzvariablen
    // Sind erst ab der Erzeugung eines Objektes dieser Klasse verfügbar.
    // Jedes Objekt hat seine eigenen Wert
    // Können von Instanzmethoden des gleichen Obejkts verwendet werden
    // Nur verfügbar solange das Objekt auf dem Speicher verfügbar ist
    private int instanzeZahl = 600;


    public static void main(String[] args) {
        
        // Variablen, die in einer Methode deklariert werden nennt man lokale Variablen
        // Ihr Scope (Gelungsbereich / Sichtbarkeit) ist auf diese Methode eingeschränkt

        int zahl = 100;
        doSomething(zahl); // Aufruf der Methode

        // Eine Methode wird erst bei ihrem Aufruf aktiv!

        doSomething(20); // Literal

        int andereZahl = 200;
        doSomething(andereZahl);

        System.out.println(staticZahl); // Klassenvariable ist hier sichtbar

    }

    // Definition der Methode
    public static void doSomething(int z) { // Name der Variable ist frei wählbar
        // Methodenparameter sind auch lokale Variablen

        System.out.println(staticZahl); // Klassenvariable ist hier sichtbar

        // System.out.println(zahl); // Hier ist Variable unbekannt
        System.out.println(z); // Der Wert wurde als Parameter an diese Methode weitergegeben
    }


}
