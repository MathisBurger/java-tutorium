package de.thi.java2.tut120625;

public abstract class Geraet {
    private String name;
    public Geraet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract double[] getWerte();
}
