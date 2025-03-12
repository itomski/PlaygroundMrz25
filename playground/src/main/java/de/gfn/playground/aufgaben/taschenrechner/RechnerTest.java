package de.gfn.playground.aufgaben.taschenrechner;

import java.util.Scanner;

public class RechnerTest {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.println();

        System.out.println(Rechner.add(a, b));
        System.out.println(Rechner.sub(a, b));
        System.out.println(Rechner.multi(a, b));
        System.out.println(Rechner.div(a, b));

        System.out.println();

        System.out.println(Rechner.getProtokoll());

    }
}
