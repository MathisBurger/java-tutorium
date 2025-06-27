package de.thi.java2.tut260625;

import java.util.ArrayList;
import java.util.List;

/* Ergebnis eines Matches */
class SpielErgebnis {
    private int toreGegner1, toreGegner2;
    public SpielErgebnis(int toreGegner1, int toreGegner2) { }
    public int getToreGegner1() { return toreGegner1; }
    public int getToreGegner2() { return toreGegner2; }
}
/* Beschreibt eine Mannschaft mit Land, Punktestand und Torverhältnis */
class Mannschaft {
    private String land; // z.B. „Deutschland“
    private int punkte;
    private int tordifferenz; // z.B. 10:3 Tore => Tordifferenz 7 (=10-3)
    public Mannschaft(String land) {  }
    public void addToTordifferenz(int wert) {
        this.tordifferenz += wert;
    }
    public String getLand() { return this.land; }
}
/* Beschreibt eine Begegnung zweier Mannschaften mit Ergebnis */
class Match {
    private Mannschaft gegner1, gegner2;
    private SpielErgebnis ergebnis;
    private char gruppe; // Spielgruppe, z.B. 'A'
    public Match(char g, Mannschaft m1, Mannschaft m2, SpielErgebnis e) {}

    public char getGruppe() { return gruppe; }
    public Mannschaft getGegner1() { return gegner1; }
    public Mannschaft getGegner2() { return gegner2; }
    public SpielErgebnis getErgebnis() { return ergebnis; }
}
/* Turnier mit Namen, Jahr und einer Liste von Matches */
class Turnier {
    private String name; // Name des Turniers
    private int jahr; // Jahr, in dem das Turnier stattfindet
    private List<Match> spiele; // alle Matches des Turniers
    public Turnier(String name, int jahr) {
        this.name = name; this.jahr = jahr;
        this.spiele = new ArrayList<>();
    }
    public void druckeBegegnungen() {
        System.out.println("Begegnungen der " + name + " " + jahr);

        for (Match m : spiele) {
            System.out.printf("%c:     %10s - %10s: %d:%d\n",
                    m.getGruppe(),
                    m.getGegner1().getLand(),
                    m.getGegner2().getLand(),
                    m.getErgebnis().getToreGegner1(),
                    m.getErgebnis().getToreGegner2());
        }
    }
    public List<Mannschaft> tabelle() {
... /* s. Teilaufgabe 2b) */ }
}
