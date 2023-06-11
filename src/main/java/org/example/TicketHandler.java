package org.example;

public interface TicketHandler {
    void handleTicket(Ticket ticket);
    void setNextHandler(TicketHandler nextHandler);
}
