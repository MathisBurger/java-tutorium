package de.thi.java2.tut290425.uebung;

public class Trecker extends Fahrzeug {

    private int hydraulikDruck;

    private boolean isoBus;

    private boolean gps;

    public Trecker() {
        super();
        this.hydraulikDruck = 0;
        this.isoBus = false;
        this.gps = false;
    }

    public Trecker(int leistung, int baujahr, int gewicht, String modellbezeichung, Kraftstoffart kraftstoffart, int hydraulikDruck, boolean isoBus, boolean gps) {
        super(leistung, baujahr, gewicht, modellbezeichung, kraftstoffart);

        // Wird hier nach dem super aufgerufen, da es sonst einen Fehler gibt
        if (kraftstoffart != Kraftstoffart.Diesel) {
            throw new RuntimeException("Fehler");
        }
        this.hydraulikDruck = hydraulikDruck;
        this.isoBus = isoBus;
        this.gps = gps;
    }
}
