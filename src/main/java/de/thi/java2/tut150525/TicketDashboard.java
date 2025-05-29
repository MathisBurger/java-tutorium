package de.thi.java2.tut150525;

import java.util.List;

public class TicketDashboard {

    private List<TicketChecker> ticketCheckers;

    public TicketDashboard(List<TicketChecker> ticketCheckers) {
        this.ticketCheckers = ticketCheckers;
    }

    public void getStats() {
        int anzahlTagestickets = 0;
        int anzahlMehrtagestickets = 0;
        int anzahlGesamttickets = 0;
        for (TicketChecker checker : ticketCheckers) {
            for (? ticket : checker) {
                // TODO: Implementieren sie hier
            }
        }

        System.out.println(anzahlTagestickets);
        System.out.println(anzahlMehrtagestickets);
        System.out.println(anzahlGesamttickets);
    }
}