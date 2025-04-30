package de.thi.java2.tut240425;

public enum Hunderasse {
    GOLDEN_RETRIEVER(0.61), DALMATINER(0.60), BEAGLE(0.41), DACKEL(0.30), MOPS(0.29);

    private final double hoehe;

    Hunderasse(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getHoehe() {
        return hoehe;
    }
}
