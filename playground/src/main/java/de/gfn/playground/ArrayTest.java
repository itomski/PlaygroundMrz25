package de.gfn.playground;

public class ArrayTest {

    public static void main(String[] args) {
        
        int i = 10;
        i = 20;
        
        int[] sammlung = {10,15,20,35}; // eine Variable mit mehreren Werten des gleichen Typs

        System.out.println(sammlung[0]);
        System.out.println(sammlung[1]);

        System.out.println();

        // Index eines Arrays ist IMMER positiv und immer ein int
        // Startwert für den Zähler festlegen; Bedingung prüfen; Zähler verändern
        for(int j = 0; j < sammlung.length; j++) {
            System.out.println(sammlung[j]);
        }

        System.out.println();

        for(int zahl : sammlung) { // jedes Element aus der Sammlung wird nacheinander in zahl gespeichert
            System.out.println(zahl);
        }

        System.out.println();

        String[] namen = {"Peter", "Bruce", "Carol", "Natasha", "Tony", "Scott"};
        for(String name : namen) {
            if(name.equals("Bruce")) continue; // Springt zum nächsen Durchlauf der Schleife
            if(name.equals("Tony")) break; // Bricht die Abarbeitung der Schleife ab

            System.out.println(name);
        }

        System.out.println();

        int[] zahlen = {2,7,99,15,32,16,20,100};
        for (int j : zahlen) {
            // if(j % 2 == 0) System.out.println(j);

            if(j % 2 == 1) continue;
            System.out.println(j);
        }
    }
    
}
