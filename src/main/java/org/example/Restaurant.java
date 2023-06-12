package org.example;

import java.util.List;

public class Restaurant {
    String name;
    Address address;

    List<Dish>Menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Dish> getDishList() {
        return Menu;
    }

    public void setDishList(List<Dish> dishList) {
        this.Menu = dishList;
    }

    public Restaurant(String name, Address address, List<Dish> dishList) {
        this.name = name;
        this.address = address;
        this.Menu = dishList;
    }
}
