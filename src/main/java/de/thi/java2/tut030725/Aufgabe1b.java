package de.thi.java2.tut030725;

public class Aufgabe1b {

    static public void setzeFarbe(String farbe) throws Exception {
        if (!farbe.equals("rot") && !farbe.equals("blau"))
            throw new Exception("Ungueltige Farbe " + farbe);
        System.out.println("Setze Farbe " + farbe + "!");
    }


    static public double berechneQuotient(double x, int y) {
        if (y == 0) throw new RuntimeException("Ungueltiger Quotient! y = 0!");
        return x / y;
    }


    static int[] werte = { 13, 14, 15 };


    /* Liefert den Wert zum index. Ist index ungültig, wird der Wert an Index 0 geliefert. */
    static int gibWertZuIndex(int index) {
        int ergebnis;
        try {
            ergebnis = werte[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            ergebnis = werte[0];
        }
        return ergebnis;
    }



    public static void main(String[] args) {
        try {
            setzeFarbe("gelb");
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        try {
            double q = berechneQuotient(100.0, 0);
        } catch (RuntimeException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

        System.out.println(gibWertZuIndex(-20));
    }
}
