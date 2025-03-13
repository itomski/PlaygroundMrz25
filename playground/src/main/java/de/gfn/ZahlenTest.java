package de.gfn;

import java.util.Scanner;

public class ZahlenTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Zahlen? ");
        int num = scanner.nextInt();

        int[] zahlen = new int[num]; // Erzeugt ein Array/Container mit passender Größe 
        
        // Array wird befüllt
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rollW6(); // aktuelle Prosition im Array mit einer Zufallszahl belegen
        }

        System.out.println();

        // Inhalt des Arrays wird angezeigt
        for (int i : zahlen) {
            System.out.println(i);
        }
    }

    private static int rollW6() {
        return (int)(Math.random() * 6) + 1;
    }
}
