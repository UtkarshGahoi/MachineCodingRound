package org.example;

import java.util.Date;

public class Delivery {
    String orderId;
    Date startDateTime;
    Date endDateTime;
    String deliveryBoyId;
    Address customerAddress;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public void setDeliveryBoyId(String deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Delivery(String orderId, Date startDateTime, Date endDateTime, String deliveryBoyId, Address customerAddress) {
        this.orderId = orderId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.deliveryBoyId = deliveryBoyId;
        this.customerAddress = customerAddress;
    }
}
