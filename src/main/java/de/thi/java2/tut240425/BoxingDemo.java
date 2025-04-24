package de.thi.java2.tut240425;

public class BoxingDemo {
    public static void main(String[] args) {
        int a = 42;
        Integer b = a;

    }
}

public class UnboxingVergleich {
    public static void main(String[] args) {

        Byte x = 127;

        if (x == y) {
            System.out.println("x == y (unboxed)");
        }
    }
}
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
