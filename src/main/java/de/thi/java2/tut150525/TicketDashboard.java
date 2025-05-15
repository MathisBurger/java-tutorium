package de.thi.java2.tut150525;

import java.util.List;

public class TicketDashboard {

    private List<TicketChecker<Ticket>> ticketCheckers;

    public TicketDashboard(List<TicketChecker<Ticket>> ticketCheckers) {
        this.ticketCheckers = ticketCheckers;
    }

    public void getStats() {
        int anzahlTagestickets = 0;
        int anzahlMehrtagestickets = 0;
        int anzahlGesamttickets = 0;
        for (TicketChecker<Ticket> checker : ticketCheckers) {
            for (Ticket ticket : checker) {
                if (ticket instanceof TagesTicket) {
                    anzahlTagestickets++;
                }
                if (ticket instanceof MehrtagesTicket) {
                    anzahlMehrtagestickets++;
                }
                if (ticket instanceof GesamtTicket) {
                    anzahlGesamttickets++;
                }
            }
        }

        System.out.println(anzahlTagestickets);
        System.out.println(anzahlMehrtagestickets);
        System.out.println(anzahlGesamttickets);
    }
}
