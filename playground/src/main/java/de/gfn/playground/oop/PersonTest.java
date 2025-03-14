package de.gfn.playground.oop;

public class PersonTest {

    public static void main(String[] args) {
        
        // Aufruf eines 3-Parameter-Konstruktors
        Person p1 = new Person("Peter", "Parker", 75);

        /* Nur möglich, wenn die Eigenschaften public sind
        Person p2 = new Person();
        p2.vorname = "Carol";
        p2.nachname = "Danvers";
        p2.gewicht = 62;
        */

        Person p3 = new Person();
        p3.setVorname("Scott");
        p3.setNachname("Lang");
        p3.setGewicht(82);

        /*
        Person p4 = new Person();
        p4.vorname = "Bruce";
        p4.nachname = "Banner";
        p4.gewicht = 182;

        p4.vorname = null;
        */

        p3.setGewicht(-17); // Setter lehnt negative Werte ab

        printPerson(p1);
        printPerson(p3);
        //printPerson(1); // Error: Keine Person!
        //printPerson("Max Mustermann"); // Error: Keine Person!

        System.out.println();
        System.out.println(p1); // Hier wird automatisch die toString()-Methode verwendet
        System.out.println(p3);
        
        //add(10, 15);
        //add(1, 7);

    }

    // p ist ein Platzhalter für eine Person, die beim Aufruf der Methode
    // als Parameter übergeben wird
    public static void printPerson(Person p) { // Parameter MUSS eine Person sein
        System.out.println(p.getVorname().charAt(0) + ". " + p.getNachname() + ", " + p.getGewicht() + " kg");
    }

    /*
    public static int add(int a, int b) {
        return a + b;
    }
    */
}
