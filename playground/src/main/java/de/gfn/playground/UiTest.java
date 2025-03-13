package de.gfn.playground;

import java.util.Scanner;

public class UiTest {

    // private = nur in dieser Klasse sichtbar
    // static = Steht im Bauplan zur Verfügung
    // final = nach der ersten Zuweisung nicht mehr änderbar
    private static final Scanner scanner = new Scanner(System.in);

    public static final String KEYS = "\n************************************" +
                                        "\n\t 1: Erste Option" + 
                                        "\n\t 2: Zweite Option" + 
                                        "\n\t 3: Drite Option" + 
                                        "\n\t 4: Vierte Option" +
                                        "\n\t 5: Hilfe" +
                                        "\n\t 0: Programm verlassen" +
                                        "\n************************************";


    public static void main(String[] args) { // static Methoden brauchen statische Variablen
        
        System.out.println("Start");
        System.out.println(KEYS);

        // app = Label
        app: while(true) {
            System.out.print("Deine Auswahl: ");
            switch(scanner.nextInt()) {
                case 1 -> readData();
                case 2 -> printData();
                case 3 -> editData();
                case 4 -> deleteData();
                case 5 -> System.out.println(KEYS);
                case 0 -> { break app; } // Verlässt die Schleife
                default-> System.out.println("Falsche Auswahl");
            }        
        }

        System.out.println("Programm wird beendet");
    }

    private static void readData() {
        System.out.println("Lesen");
        // ....
    }

    private static void printData() {
        System.out.println("Anzeigen");
        // ....
    }

    private static void editData() {
        System.out.println("Bearbeiten");
        // ....
    }

    private static void deleteData() {
        System.out.println("Löschen");
        // ....
    }
}
