package de.thi.java2.tut280525.loesung;

public abstract class Lamp extends Device implements Switchable {

    protected boolean isOn;

    public Lamp(String name) {
        super(name);
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }
}
