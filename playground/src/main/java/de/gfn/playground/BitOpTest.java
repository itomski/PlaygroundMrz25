package de.gfn.playground;

public class BitOpTest {

    public static void main(String[] args) {
        
        int i = 68;
        int j = 7;

        // 01000100 = 68
        // 00000111 = 7
        // 00000100 = 4
        System.out.println(i & j); // AND

        // 01000100 = 68
        // 00000111 = 7
        // 01000111 = 71
        System.out.println(i | j); // OR

        // 01000100 = 68
        // 00000111 = 7
        // 01000011 = 67
        System.out.println(i ^ j); // XOR

        // 01000100 = 68
        // 00001000 = 17
        System.out.println(i >> 3);

        System.out.println();

        String name = null;

        // & Wertet beide Seiten der Expression aus
        //if(name != null & name.length() > 0)
        //    System.out.println(name.toLowerCase()); // NullPointerException

        // && Wertet nur die Rechte Seite aus, wenn die linke true ergibt
        if(name != null && name.length() > 0)
            System.out.println(name.toLowerCase()); // NullPointerException

        byte b = 125;
        System.out.println(++b);
        System.out.println(++b);
        System.out.println(++b);
        System.out.println(++b);
        System.out.println(++b);


        Object o = 1; // Integer IS-A Object
        o = "ABC"; // String IS-A Object
        o = 10.5; // Double IS-A Object

        // instanceof zeigt die Verwandschaft zu einer bestimmten Klasse an
        System.out.println(o instanceof Integer); // ist hinter dieser Referenz ein Integer auf dem Heap?

        // getClass().getName() liefert die Identität des Objekts auf dem Heap
        System.out.println(o.getClass().getName());

        int auswahl = 2;

        String hero;

        if(auswahl == 1) {
            hero = "Spiderman";
        }
        else {
            hero = "Ant-Man"; 
        }
        System.out.println(hero);
        
        System.out.println((auswahl == 1) ? "Spiderman" : "Ant-Man");
        
        hero = (auswahl == 1) ? "Spiderman" : "Ant-Man";
        System.out.println(hero);

        hero = (auswahl == 1) ? "Spiderman" : (auswahl == 2) ? "Ant-Man" : "Hulk";
    }
}
