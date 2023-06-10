package org.example;

import java.util.List;

public class Building {
    String name;
    private List<Floor>floorList;

    public Building(String name, List<Floor> floorList) {
        this.name = name;
        this.floorList = floorList;
    }
}
