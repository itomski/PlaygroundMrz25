
package de.gfn.playground.aufgaben.pilzsuche;

import java.util.Scanner;

public class PilzsucheApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Spielstart\n");
        
        Pilzsuche pilzsuche = new Pilzsuche(5, 5, 10, 20);

        while(!pilzsuche.gameOver()) {
            try {
                System.out.print("x: ");
                int x = scanner.nextInt();
                System.out.print("y: ");
                int y = scanner.nextInt();

                if(pilzsuche.pilzSuchen(x, y)) {
                    System.out.println("gefunden");
                }
                else {
                    System.out.println("nicht gefunden");
                }
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Falsche Eingabe.");
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("\nVersuche: " + pilzsuche.getVersuche());
        System.out.println("Gefunden: " + pilzsuche.getGefunden());
        pilzsuche.print();
    }
}