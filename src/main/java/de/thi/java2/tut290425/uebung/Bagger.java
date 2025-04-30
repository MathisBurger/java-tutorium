package de.thi.java2.tut290425.uebung;

public class Bagger extends Fahrzeug {

    private int armLaenge;

    private int schaufelVolumen;

    public Bagger() {
        super();
        this.armLaenge = 100;
        this.schaufelVolumen = 10;
    }

    public Bagger(int leistung, int baujahr, int gewicht, String modellbezeichung, Kraftstoffart kraftstoffart, int armLaenge, int schaufelVolumen) {
        super(leistung, baujahr, gewicht, modellbezeichung, kraftstoffart);

        // Wird hier nach dem super aufgerufen, da es sonst einen Fehler gibt
        if (kraftstoffart != Kraftstoffart.Diesel) {
            throw new RuntimeException("Fehler");
        }

        this.armLaenge = armLaenge;
        this.schaufelVolumen = schaufelVolumen;
    }
}
