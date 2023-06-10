package org.example;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Room room=new Room("A1");
        Room room1=new Room("A2");
        List<Room>roomList=new ArrayList<>();
        roomList.add(room);
        roomList.add(room1);

        Floor floor=new Floor("GroundFloor",roomList);

        List<Floor>floorList=new ArrayList<>();
        floorList.add(floor);

        List<Building>buildings=new ArrayList<>();;

        Building building=new Building("UDGAM",floorList);
        buildings.add(building);

        BookingService bookingService=new BookingService();
        BookConferenceRoom bookConferenceRoom=new BookConferenceRoom(building,floor,room1,"1","3");
        bookingService.bookConferenceRoom(buildings,bookConferenceRoom);
        Map<Room, List<Booking>> allBookings = bookingService.findAllBookings();
        for (Map.Entry<Room, List<Booking>> entry : allBookings.entrySet()){
            Room key = entry.getKey();
            System.out.println(key.getName());
            List<Booking> value = entry.getValue();

        }


    }
}