package de.thi.java2.tut120625;

public class SmartGummiEnte extends LampeMitSchalter implements TemperaturSensor{

    private double temperatur;

    public SmartGummiEnte() {
        super("", 0, 0);
        this.temperatur = 0;
    }

    public SmartGummiEnte(String name, double status, int farbe, double temperatur) {
        super(name, status, farbe);
        this.temperatur = temperatur;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public double[] getWerte() {
        return new double[]{this.getStatus(), this.getFarbe(), getTemperatur()};
    }


}
