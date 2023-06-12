package org.example;

public class CreditCardPayment implements PaymentStrategy{

    String cardNumber;
    String nameOfHolder;
    String cvvCode;
    @Override
    public void pay(Double amount) {

    }

    public CreditCardPayment(String cardNumber, String nameOfHolder, String cvvCode) {
        this.cardNumber = cardNumber;
        this.nameOfHolder = nameOfHolder;
        this.cvvCode = cvvCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOfHolder() {
        return nameOfHolder;
    }

    public void setNameOfHolder(String nameOfHolder) {
        this.nameOfHolder = nameOfHolder;
    }

    public String getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }
}
