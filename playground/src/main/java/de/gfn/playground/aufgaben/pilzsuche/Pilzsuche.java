package de.gfn.playground.aufgaben.pilzsuche;

import java.util.Random;

public class Pilzsuche {

    private final Random rand = new Random();

    private int[][] spielfeld;

    private int maxVersuche;

    private int versuche;

    private int gefunden;

    private int zeilen;

    private int spalten;

    private int anzahlPilze;


    public Pilzsuche(int zeilen, int spalten, int anzahlPilze, int maxVersuche) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.anzahlPilze = anzahlPilze;
        this.maxVersuche = maxVersuche;
        reset();
    }

    public void reset() {
        spielfeld = new int[zeilen][spalten];
        pilzeSetzen();
        versuche = 0;
        gefunden = 0;
    }

    public void pilzeSetzen() {
        for (int i = 0; i < anzahlPilze; i++) {
            pilzSetzen();
        }
    }

    public boolean pilzSuchen(int x, int y) {
        versuche++;
        if(spielfeld[x][y] == 1) {
            spielfeld[x][y] = 2;
            gefunden++;
            return true;
        }
        return false;
    }

    private void pilzSetzen() {
        int x = rand.nextInt(zeilen);
        int y = rand.nextInt(spalten);

        if(spielfeld[x][y] != 0) {
            pilzSetzen();
        }
        else {
            spielfeld[x][y] = 1;
        }
    }

    public void print() {

        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i < spalten; i++)
            sb.append("---");

        System.out.println();
        System.out.println(sb);
        for (int[] zeile : spielfeld) {
            System.out.print('|');
            for (int feld : zeile) {
                System.out.printf(" %s ", feld);
            }
            System.out.println('|');
        }
        System.out.println(sb);
    }

    public int getGefunden() {
        return gefunden;
    }

    public int getVersuche() {
        return versuche;
    }

    public boolean gameOver() {
        return !(maxVersuche > versuche);
    }
}
