package de.thi.java2.tut290425.uebung;

public abstract class Fahrzeug {

    protected int leistung;

    protected int baujahr;

    protected int gewicht;

    protected String modellbezeichung;

    protected Kraftstoffart kraftstoffart;

    public Fahrzeug() {
        this.leistung = 100;
        this.baujahr = 2025;
        this.gewicht = 1000;
        this.modellbezeichung = "Fahrzeug 1";
        this.kraftstoffart = Kraftstoffart.Benzin;
    }

    public Fahrzeug(int leistung, int baujahr, int gewicht, String modellbezeichung, Kraftstoffart kraftstoffart) {
        this.leistung = leistung;
        this.baujahr = baujahr;
        this.gewicht = gewicht;
        this.modellbezeichung = modellbezeichung;
        this.kraftstoffart = kraftstoffart;
        // Hier keine Prüfung ob richtige Kraftstoffart
    }
}
