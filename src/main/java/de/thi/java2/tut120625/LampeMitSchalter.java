package de.thi.java2.tut120625;

public class LampeMitSchalter extends Geraet implements Lampe, Schalter{

    private double status;

    private int farbe;

    public LampeMitSchalter(String name, double status, int farbe) {
        super(name);
        this.status = status;
        this.farbe = farbe;
    }

    public int getFarbe() {
        return farbe;
    }

    public void setFarbe(int farbe) {
        this.farbe = farbe;
    }

    public double[] getWerte() {
        return new double[] {status, farbe};
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public double getStatus() {
        return status;
    }

}
