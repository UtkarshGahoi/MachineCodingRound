package org.example;

public class Ticket {
    private int id;
    private int complexity;

    public Ticket(int id, int complexity) {
        this.id = id;
        this.complexity = complexity;
    }

    public int getId() {
        return id;
    }

    public int getComplexity() {
        return complexity;
    }
}
