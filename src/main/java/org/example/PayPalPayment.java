package org.example;

public class PayPalPayment implements PaymentStrategy{

    String name;
    String id;

    public PayPalPayment(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void pay(Double amount) {

    }
}
