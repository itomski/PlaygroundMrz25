package de.gfn.playground.aufgaben;

public class KreisTools {

    // TODO: Umfang berechnen
    public static double berechneUmfang(double radius) {
        return 2 * Math.PI * radius;
    }


    // TODO: Fläche berechnen
    public static double berechneFlaeche(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}