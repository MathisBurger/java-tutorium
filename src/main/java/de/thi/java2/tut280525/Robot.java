package de.thi.java2.tut280525;

public abstract class Robot extends Device implements Switchable {
    protected boolean isOn;

    public Robot(String name) {
        super(name);
    }
}
