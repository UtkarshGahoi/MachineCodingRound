package org.example;

import java.util.List;

public class Floor {
    String name;
    List<Room>roomList;

    public Floor(String name, List<Room> roomList) {
        this.name = name;
        this.roomList = roomList;
    }
}
