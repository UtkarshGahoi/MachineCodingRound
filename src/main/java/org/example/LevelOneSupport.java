package org.example;

public class LevelOneSupport implements TicketHandler{
         TicketHandler nextHandler;
        public void handleTicket(Ticket ticket) {
            if (ticket.getComplexity() == 1) {
                System.out.println("Level One Support: Handling ticket " + ticket.getId());
            } else if (nextHandler != null) {
                nextHandler.handleTicket(ticket);
            }
        }

        public void setNextHandler(TicketHandler nextHandler) {
            System.out.println("inside the set next handler"+nextHandler.toString());
            this.nextHandler = nextHandler;
        }

}
