package de.thi.java2.tut280525.loesung;

public class SmartLamp extends Lamp implements Adjustable {
    private int brightness;

    public SmartLamp(String name) {
        super(name);
        this.brightness = 0;
    }

    public int getLevel() {
        return this.brightness;
    }

    public void setLevel(int level) {
        this.brightness = level;
    }

    public String getStatus() {
        return "Brightness: " + this.brightness;
    }
}

