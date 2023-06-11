package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TicketHandler levelOne = new LevelOneSupport();
        TicketHandler levelTwo = new LevelTwoSupport();

        levelOne.setNextHandler(levelTwo);

        // Create tickets
        Ticket ticket1 = new Ticket(1, 1);
        Ticket ticket2 = new Ticket(2, 2);
        Ticket ticket3 = new Ticket(3, 3);
        Ticket ticket4 = new Ticket(4, 4);

        // Process the tickets
        levelOne.handleTicket(ticket1);  //

    }
}