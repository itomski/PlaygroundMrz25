package de.gfn.playground.aufgaben;

import de.gfn.playground.aufgaben.produktverwaltung.Produkt;

public class Aufgabe4 {

    /*
    Schreibe eine Klasse für ein Produkt
    Es enthält eine folgende Eigenschaften:
    Produktnummer
    Name
    Beschreibung
    Preis
    IstVerfügbar?

    Schreibe einen passenden Konstruktor für alle diese Werte
    Schreibe passende Getter und Setter
    Schreibe eine passende toString-Methode

    Instanziere diese Klasse 3x
    (Instanzierung = Erzeugung eines Objekts)
     */

    public static void main(String[] args) {

        // Der Konstruktor belegt das Objekt mit Startwerten
        Produkt p1 = new Produkt(); // Baut ein leeres Produkt
        p1.setName("Socken"); // Zustand nach der Objekterzugung veränden
        System.out.println(p1);
        
        Produkt p2 = new Produkt(25, "Socken", "Blau, 100 % Wolle", 9.99);
        System.out.println(p2);
        
        // Pro Objekt kann der Konstruktor nur 1x aufgerufen werden
        // Beim Aufruf wird immer ein neues Objekt erzeugt
        Produkt p3 = new Produkt(26, "Tasse", "Rot, Keramik", 6.99, true);
        System.out.println(p3);
    }
}