package de.thi.java2.tut280525;

public abstract class Lamp extends Device implements Switchable {

    protected boolean isOn;

    public Lamp(String name) {
        super(name);
        this.isOn = false;
    }
}
