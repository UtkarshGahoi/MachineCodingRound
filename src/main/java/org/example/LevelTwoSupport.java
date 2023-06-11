package org.example;

public class LevelTwoSupport implements  TicketHandler{
    private TicketHandler nextHandler;
    @Override
    public void handleTicket(Ticket ticket) {
        if (ticket.getComplexity() == 2) {
            System.out.println("Level Two Support: Handling ticket " + ticket.getId());
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        }
    }

    @Override
    public void setNextHandler(TicketHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
