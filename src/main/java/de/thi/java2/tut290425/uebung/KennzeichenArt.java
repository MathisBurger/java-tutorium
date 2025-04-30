package de.thi.java2.tut290425.uebung;

public enum KennzeichenArt {
    Normal(19),
    Landwirtschaft(7);

    private final int steuersatz;

    KennzeichenArt(int steuersatz) {
        this.steuersatz = steuersatz;
    }

    public int getSteuersatz() {
        return steuersatz;
    }
}
