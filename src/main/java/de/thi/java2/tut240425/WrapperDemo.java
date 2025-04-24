package de.thi.java2.tut240425;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(128);
        Integer i2 = new Integer(128);

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1.equals(i2): " + i1.equals(i2));
    }
}
