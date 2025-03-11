package de.gfn.playground.aufgaben;

import java.util.Scanner;

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

        


        
        // TODO: Berechnung ausführen
        // TODO: Ergebnis anzeigen
        
    }
}
