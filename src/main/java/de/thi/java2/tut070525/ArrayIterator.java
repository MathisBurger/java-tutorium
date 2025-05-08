package de.thi.java2.tut070525;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Notenblatt> {

    private final Notenblatt[] notenblattArray;

    private int index = 0;

    public ArrayIterator(Notenblatt[] notenblattArray) {
        this.notenblattArray = notenblattArray;
    }

    @Override
    public boolean hasNext() {
        //for (int i = 0; i < notenblattArray.length; i++) {}
        return this.index < this.notenblattArray.length;
    }

    @Override
    public Notenblatt next() {
        Notenblatt notenblatt = this.notenblattArray[this.index];
        this.index += 1;
        return notenblatt;
    }
}
