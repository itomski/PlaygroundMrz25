package de.gfn.playground;

import java.util.Scanner;

public class KontrollstrukturenTest1 {
    
    public static void main(String[] args) {
        
        int i = 10;

        if(i < 5) {
            System.out.println("zu klein");
        }
        else if(i > 20) // Ohne {} gehört nur die nächste Anweisung zum if
            System.out.println("zu groß");
        else {
            System.out.println("Passt!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wähle eine Zahl zwischen 1 und 7: ");
        
        /*
        switch(scanner.nextInt()) { // ganzzahlen (ohne long), char, String, ENUMs

            case 0: 
            case 1: 
                System.out.println("Montag");
                break;

            case 2: System.out.println("Dienstag"); break;
            case 3: System.out.println("Mittwoch"); break;
            case 4: System.out.println("Donnerstag"); break;
            case 5: System.out.println("Freitag"); break;
            case 6: System.out.println("Samstag"); break;
            case 7: System.out.println("Sonntag"); break;

            // Sammelt alles ein, für das es keinen case gibt
            default: System.out.println("Falsche Zahl"); 
        }
        */
        
        switch(scanner.nextInt()) { // ganzzahlen (ohne long), char, String, ENUMs

            // Bei verwendung von -> ist ein break nicht nötig

            case 0 -> {} // Hier passiert nichts
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3 -> System.out.println("Mittwoch");
            case 4 -> System.out.println("Donnerstag");
            case 5 -> System.out.println("Freitag"); 
            case 6, 7 -> System.out.println("Wochenende");

            // Sammelt alles ein, für das es keinen case gibt
            default ->System.out.println("Falsche Zahl"); 
        }

    }

}
