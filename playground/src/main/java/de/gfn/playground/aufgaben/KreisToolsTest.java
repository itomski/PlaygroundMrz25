package de.gfn.playground.aufgaben;

import java.util.Scanner;

import de.gfn.playground.aufgaben.tools.KreisTools;

public class KreisToolsTest {

    public static void main(String[] args) {
        
        // TODO: Radius vom User abfragen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie ist der Radius? ");
        double radius = scanner.nextDouble();
        System.out.println(radius);

        // TODO: Art der Berechnung abfragen (Fläche oder Umfang)
        System.out.print("\nWas willst du berechnen? 1 = Umfang, 2 = Fläche: ");
        int berechnungsArt = scanner.nextInt();
        System.out.println(berechnungsArt);

        // scanner.close();

        double erg; // ist bis zum Ende der main-Methode sichtbar

        // Die Möglichkeiten schließen sich gegenseitig aus!
        if(berechnungsArt == 1) {
            // TODO: Berechnung ausführen
            erg = KreisTools.berechneUmfang(radius);
            // TODO: Ergebnis anzeigen
            System.out.printf("Der Umfang des Kreises mit dem Radius %f ist %f.", radius, erg);
        } // hier ist erg out of scope
        else if(berechnungsArt == 2) {
            // TODO: Berechnung ausführen
            erg = KreisTools.berechneFlaeche(radius);
            // TODO: Ergebnis anzeigen
            System.out.printf("Die Fläche des Kreises mit dem Radius %f ist %f.", radius, erg);
        }
        else {
            System.out.println("Falsche Eingabe!");
        }
        

        {
            int x = 200;
        } // hier ist das x out of scope (vom Speicher entfernt) und kann neu deklariert werden
        int x = 500;

    }
}
