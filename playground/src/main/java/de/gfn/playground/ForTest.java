package de.gfn.playground;

import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {
        
        // Zähler i wird beim Start der Schleife auf 0 gesetzt
        // Vor der Abarbeitung des Blocks wird geprüft, ob i < 10 ist
        // Block wird ausgeführt
        // Danach i++
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie oft? ");

        // var = der Compiler entscheidet bei der ersten Zuweisung, welchen Datentyp die Variable haben wird
        var count = scanner.nextInt();

        for(var i = 0; i < count; i++) {
            System.out.println(i);
        }

        /*
        for(;;) { // Endlos-Schleife
            System.out.println("");
            // kann mit break unterbrochen werden
        }
        */

        int j = 10;
        for(; j > 0 ;) { // arbeitet wie eine while Schleife
            System.out.println(j--);
        }

        j = 10;
        for(; j > 0 ; System.out.println(j--));

        System.out.println("Ende");
    }
}
