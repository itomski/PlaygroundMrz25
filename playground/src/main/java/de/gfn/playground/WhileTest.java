package de.gfn.playground;

public class WhileTest {
    
    public static void main(String[] args) {
    
        boolean exit = true;

        while(!exit) { // Bedingung wird vor dem Block getestet
            System.out.println("Ich mache was...");
        }

        do {
            System.out.println("Ich mache was...");
        } while(!exit); // Bedingung wird nach dem Block getestet d.h. Block wird mind. 1x ausgeführt


    }
}
