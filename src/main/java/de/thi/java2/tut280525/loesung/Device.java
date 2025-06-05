package de.thi.java2.tut280525.loesung;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getStatus();
}
