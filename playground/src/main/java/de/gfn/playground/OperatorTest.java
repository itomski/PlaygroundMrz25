package de.gfn.playground;

public class OperatorTest {

    public static void main(String[] args) {
        
        System.out.println(5 % 2); // 1
        System.out.println(5 % 7); // 5
        System.out.println(5 % -2); // 1

        System.out.println(5 + 2 * 3);
        System.out.println((5 + 2) * 3);

        // Beim Rechnen werden die Operanden zum jeweils größeren angehoben

        // int i = 5 / 2; 
        double i = (double)5 / 2; // 2 wird auch zum double
        i = 5.0 / 2; // 2 wird auch zum double
        System.out.println(i);

        // int j = (double)5 / 2; // Erg ist ein double
        // System.out.println(j);

        byte b1 = 10;
        byte b2 = 15;
        // byte sum = b1 + b2; //  byte und shot werden beim rechnen automatisch zu int angehoben
        int sum = b1 + b2; // OK

        System.out.println();

        int zahl = 10; // dezimal: 10
        System.out.println(zahl);
        zahl = 010; // oktal: 8
        System.out.println(zahl);
        zahl = 0b10; // binär: 2
        System.out.println(zahl);
        zahl = 0x10; // hex: 16
        System.out.println(zahl);

        System.out.println();

        int i2 = 10;
        i2 += 5; // i2 = (int)(i2 + 5);
        System.out.println(i2);

        b1 += 5; // b1 = (byte)(b1 + 5);

        // vor dem zusammengesetzten Operator MUSS immer eine Variable benutzt werden
        // 1 += 1;

        b1++; // geht nur mit Variablen
        b1--;
        --b1;
        ++b1;

        b1 = 10;
        zahl = b1++; // zahl = 10
        b1 = 10;
        zahl = ++b1; // zahl = 11
        
        
    }
}
