package de.thi.java2.tut290425.uebung;

public class Auto extends Fahrzeug {

    private boolean kamera;

    private int anzahlSitze;

    public Auto() {
        super();
        this.kamera = false;
        this.anzahlSitze = 0;
    }

    public Auto(int leistung, int baujahr, int gewicht, String modellbezeichung, Kraftstoffart kraftstoffart, boolean kamera, int anzahlSitze) {
        super(leistung, baujahr, gewicht, modellbezeichung, kraftstoffart);
        this.kamera = kamera;
        this.anzahlSitze = anzahlSitze;
    }
}
