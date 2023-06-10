package org.example;

public class Bug extends Ticket{

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double getTicket() {
        return Math.random();
    }

}
