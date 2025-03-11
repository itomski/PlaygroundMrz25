package de.gfn.playground.aufgaben.tools;

public class KreisTools {

    // Klassenmethoden (static) = Werden direkt auf der Klasse ausgeführt
    // Instanzmethoden = Vor der Verwendung muss erstmal mit new ein neues Objekt erzeugt werden

    // TODO: Umfang berechnen
    public static double berechneUmfang(double radius) {
        return 2 * Math.PI * radius;
    }


    // TODO: Fläche berechnen
    public static double berechneFlaeche(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}