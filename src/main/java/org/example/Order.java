package org.example;

import java.util.List;

public class Order {

     double amount=0;
     Address sourceAdress;;
     Address destinationAddress;

    public Address getSourceAdress() {
        return sourceAdress;
    }

    public void setSourceAdress(Address sourceAdress) {
        this.sourceAdress = sourceAdress;
    }

    public Address getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Order(List<Dish>dishList, Address address, Address address1){
        System.out.println("Total amount"+dishList.size());
       for(Dish dish:dishList){
           System.out.println("Total amount for this o"+dish.getName()+dish.getPrice());
           amount+=dish.getPrice();
       }
        setAmount(amount);
        setSourceAdress(address);
        setDestinationAddress(address1);


    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
