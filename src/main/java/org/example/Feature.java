package org.example;

public class Feature  extends Ticket{
    String status;

    @Override
    public double getTicket() {
        return "Feature";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
