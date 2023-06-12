package org.example;

public class Bill {
    String customerName;
    String orderId;
    String billId;
    double totalAmount;
    double tax;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Bill(String customerName, String orderId, String billId, double totalAmount, double tax) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.billId = billId;
        this.totalAmount = totalAmount;
        this.tax = tax;
    }
}
