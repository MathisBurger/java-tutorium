package de.thi.java2.tut070525;

import java.util.Iterator;

public class LeaderboardWithArray implements Iterable<Notenblatt> {

    private Notenblatt[] notenblattArray;

    public LeaderboardWithArray(Notenblatt[] notenblattArray) {
        this.notenblattArray = notenblattArray;
    }

    @Override
    public Iterator<Notenblatt> iterator() {
        return new ArrayIterator(this.notenblattArray);
    }
}
