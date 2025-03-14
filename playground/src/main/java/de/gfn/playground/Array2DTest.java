package de.gfn.playground;

public class Array2DTest {

    public static void main(String[] args) {
        
        /*
         char[] zeile1 = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
         char[][] spielfeld = {
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X'}
         };

         spielfeld[4][2] = '@';

         for(char[] zeile : spielfeld) { // Bewegung Zeile für Zeile
            for(char feld : zeile) { // Bewegung Feld für Feld
                System.out.printf(" %s ", feld);
            }
            System.out.println();
         }
         */

         System.out.println();

         int[][] spielfeld2 = new int[10][10]; // Array mit 5 Zeile und 5 Feldern pro Zeile (leer)

         for(int[] zeile : spielfeld2) { // Bewegung Zeile für Zeile
            for(int feld : zeile) { // Bewegung Feld für Feld
                System.out.printf(" %s ", feld);
            }
            System.out.println();
         }
    }
}
