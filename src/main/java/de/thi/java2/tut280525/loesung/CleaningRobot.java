package de.thi.java2.tut280525.loesung;

public class CleaningRobot extends Robot {
    public CleaningRobot(String name) {
        super(name);
        this.isOn = false;
    }

    public String getStatus() {
        return "Cleaning Robot: " + this.getName() + ", isOn: " + this.isOn;
    }
}

