package org.example;

public class Story extends Ticket{
    String status;
    @Override
    public double getTicket() {
        return "story";
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
