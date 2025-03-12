package de.gfn.playground;

import java.util.Scanner;

public class LogicTest {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int durchgang = 0;
        
        while(!exit) {

            System.out.println(++durchgang);
            System.out.print("Noch mal? ");

            // next = liefert den eigegeben Text bis zum ersten Leerzeichen aus
            // trim = entfernt Leerzeichen und Tabs an beiden Enden des Textes
            // toLowerCase = gibt die Eigabe in kleinbuchstaben
            // equals = Inhaltsvergleich
            if(!scanner.next().trim().toLowerCase().equals("ja")) {
                exit = true;
            }
        }

        System.out.println("Programmende!");

    }
}
