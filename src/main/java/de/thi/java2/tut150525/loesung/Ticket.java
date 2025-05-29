package de.thi.java2.tut150525.loesung;

public abstract class Ticket {

    protected int preis;

    protected int ticketNr;

    public Ticket(int preis, int ticketNr) {
        this.preis = preis;
        this.ticketNr = ticketNr;
    }

     public abstract boolean canCheckIn(long datum);
}
