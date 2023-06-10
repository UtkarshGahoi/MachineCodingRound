package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {
    Map<Room, List<Booking>> bookings=new HashMap<>();
    public  boolean bookConferenceRoom(List<Building> buildings,BookConferenceRoom bookConferenceRoom){
        Room roomName=bookConferenceRoom.getRoomName();
        boolean findBooking=false;

        List<Booking> bookings1 = bookings.get(roomName);
//        for(Booking booking:bookings1){
//           //comparing the timestamp of bookings.
//            findBooking=true;
//            return false;
//        }
        if(!findBooking){
            System.out.println("Got the booking");
            Booking booking=new Booking(bookConferenceRoom.getStrtingTime(),bookConferenceRoom.getEndTime());

                List<Booking>bookings3=new ArrayList<>();
                bookings3.add(booking);
                bookings.put(bookConferenceRoom.getRoomName(),bookings3);
            }


        return true;

    }
    public Map<Room, List<Booking>> findAllBookings(){
        return  bookings;
    }
}
