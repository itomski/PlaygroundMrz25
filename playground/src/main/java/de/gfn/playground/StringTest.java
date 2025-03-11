package de.gfn.playground;

public class StringTest {

    public static void main(String[] args) {

        // \t Tab
        // \n Neue Zeile
        // \" Das entsprechende Zeichen
        // \u1234

        String text = "\tMein Name ist \"Spriderman\"... \u0CA2 \n";
        System.out.println(text);
        char c = '\u05d0';
        System.out.println(c);


    }

}
