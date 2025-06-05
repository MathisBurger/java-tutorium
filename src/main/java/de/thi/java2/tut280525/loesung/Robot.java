package de.thi.java2.tut280525.loesung;

public abstract class Robot extends Device implements Switchable {
    protected boolean isOn = false;

    public Robot(String name) {
        super(name);
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }
}
