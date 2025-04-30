package de.thi.java2.tut240425;

public class UnboxingVergleich {
    public static void main(String[] args) {

        Byte x = 127;
        byte y = 127;

        if (x == y) {
            System.out.println("x == y (unboxed)");
        }
    }
}
