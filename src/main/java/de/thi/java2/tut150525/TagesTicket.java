package de.thi.java2.tut150525;

public class TagesTicket extends Ticket {

    private int datum;

    public TagesTicket(int preis, int ticketNr, int datum) {
        super (preis, ticketNr);
        this.datum = datum;
    }

    @Override
    public boolean canCheckIn(long datum) {
        return this.datum == datum;
    }
}
