package de.gfn.playground;

public class StringTest2 {

    public static void main(String[] args) {
        
        // Landet im String-Literal-Pool
        String s1 = "Das ist das Haus von Nikigraus!"; // Literal

        // Erzeugt immer ein neues Objekt
        String s2 = new String("Das ist das Haus von Nikigraus!"); // Mit dem Konstruktor

        int a = 100;
        int b = 300;
        System.out.println(a == b); // bei primitiven Datentypen == ist ein Wertvergleich

        System.out.println();

        // Bei komplexen Datentypen == prüft, ob es das gleiche Objekt auf dem Heap ist
        System.out.println(s1 == s2);
        // Bei komplexen Datentypen .equals prüft, ob der Wert gleich ist
        System.out.println(s1.equals(s2));

        System.out.println();

        String s3 = "Das ist das Haus von Nikigraus!"; // Verwendet den Wert aus dem Pool
        System.out.println(s1 == s3); // gleiches Objekt aus dem Pool
        System.out.println(s1.equals(s3)); // gleicher Inhalt

        System.out.println();
        s3 += "...";
        System.out.println(s1 == s3); // ist nicht mehr das gleiche Objekt
        System.out.println(s1.equals(s3));

        // Strings sind in Java immutable = nicht veränderbar
        String text = "Hallo";
        text += " Welt"; // text = text + " Welt"

        // Strings werden NICHT verändert. Jede Änderung produziert ein neues String Objekt

        System.out.println();

        // Beim Änderungen an Strings muss die neue Version auf die alte Referenz zugewiesen werden
        text = text.toLowerCase();
        System.out.println(text);
        
        text = "Peter";
        System.out.println(text.charAt(0) + ".");
        System.out.println(text.substring(0, 3) + "...");

        text = "15";
        System.out.println(text + 7); // Verkettung, da einer der Operanden String ist

        // parseInt wandelt einen String in ein int um
        System.out.println(Integer.parseInt(text) + 7);

        System.out.println("Das ist " + "ein Haus " + "von Peter");
        String part = "ein Haus ";
        System.out.println("Das ist " + part + "von Peter");

        String s5 = "Peter Parker";
        String s6 = "peter parker";
        System.out.println(s5.equals(s6)); // Vergleicht den Inhalt
        System.out.println(s5.equalsIgnoreCase(s6)); // Vergleicht den Inhalt ohne auf die Groß/Kleinschreibung zu auchten
        System.out.println(s5.toLowerCase().equals(s6.toLowerCase())); // Vergleicht den Inhalt ohne auf die Groß/Kleinschreibung zu auchten

        s5 = "Peter Parker";
        s6 = "Bruce Banner";
        String s7 = "Tony Stark";
        String s8 = "Peter Parker";
        System.out.println(s5.compareTo(s6)); // größer
        System.out.println(s5.compareTo(s7)); // kleiner
        System.out.println(s5.compareTo(s8)); // gleich
        
    }
}
