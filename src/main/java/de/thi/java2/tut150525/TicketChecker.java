package de.thi.java2.tut150525;

import java.util.Iterator;
import java.util.Set;

public class TicketChecker<T extends Ticket> implements Iterable<T> {

    private Set<T> tickets;

    public TicketChecker(Set<T> tickets) {
        this.tickets = tickets;
    }

    public boolean checkTicket(T ticket, long datum) {
        if (tickets.contains(ticket)) {
            return ticket.canCheckIn(datum);
        }
        return false;
    }

    public Iterator<T> iterator() {
        return this.tickets.iterator();
    }

}
