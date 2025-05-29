package de.thi.java2.tut150525.loesung;

public class MehrtagesTicket extends Ticket {

    private int startDatum;

    private int endDatum;

    public MehrtagesTicket(int preis, int ticketNr, int startDatum, int endDatum) {
        super(preis, ticketNr);
        this.startDatum = startDatum;
        this.endDatum = endDatum;
    }

    @Override
    public boolean canCheckIn(long datum) {
        return datum >= startDatum && datum <= endDatum;
    }
}
