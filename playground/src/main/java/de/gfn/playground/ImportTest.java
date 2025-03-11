
package de.gfn.playground;

// Alle Klassen außerhalb dieses Package (de.gfn.playground) muss importiert werden
// Alle Klassen aus dem Package java.lang sind automatisch importiert
import java.time.LocalDate;
import java.util.Date;

public class ImportTest { // Block

    public static void main(String[] args) { // Block

        Date datum = new Date(); // Sollte in neuen Programmen nicht mehr verwendet werden
        System.out.println(datum);

        LocalDate ld = LocalDate.now(); // now liefert das aktuelle Datum
        System.out.println(ld);

        // Eine lokale Variable ist ab der Deklaration bis zum Ende des Blocks sichtbar, in dem sie deklariert wurde
        double erg = Math.pow(5, 2);
        System.out.println(erg);

        System.out.println(Math.PI);

        System.out.println(Math.pow(5, 2)); // sout

        System.out.println();

        int w6 = (int)(Math.random() * 6) + 1;
        System.out.println(w6);

        w6 = (int)(Math.random() * 6) + 1;
        System.out.println(w6);

        System.out.println(rollW6());
        System.out.println(rollW6());
        System.out.println(rollW100());
        System.out.println(rollW100());

        System.out.println(roll(6));
        System.out.println(roll(100));
        System.out.println(roll(20));
    }

    // Methoden kapseln einen wiederverwendbaren Code

    public static int rollW6() { // Liefert Zahlen zwischen 1 und 6
        return (int)(Math.random() * 6) + 1;
    }

    public static int rollW100() { // Liefert Zahlen zwischen 1 und 100
        return (int)(Math.random() * 100) + 1;
    }

    public static int roll(int max) { // Liefert Zahlen zwischen 1 und max
        return (int)(Math.random() * max) + 1;
    }
}

