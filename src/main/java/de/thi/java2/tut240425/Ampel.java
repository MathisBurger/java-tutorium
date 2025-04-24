package de.thi.java2.tut240425;

enum AmpelZustand {
    INAKTIV, ZEIGT_ROT, ZEIGT_ROT_GELB, ZEIGT_GRUEN, ZEIGT_GELB
}

public class Ampel {
    private AmpelZustand zustand;

    public Ampel(AmpelZustand zustand) {
        this.zustand = zustand;
    }

    public void printStatus() {
        System.out.printf("Ampel: %s (%d)%n", zustand.name(), zustand.ordinal());
    }

    public static void main(String[] args) {
        Ampel a = new Ampel(AmpelZustand.ZEIGT_ROT_GELB);
        a.printStatus();

        for (AmpelZustand zustand : AmpelZustand.values()) {
            System.out.println(zustand);
        }
    }
}
