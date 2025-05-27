package de.thi.java2.tut280525;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Methode zur Beschreibung des Geräts
    public abstract String getStatus();
}
