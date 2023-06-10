package org.example;

public class BookConferenceRoom {
    Building buildingName;
    Floor floorName;

    Room roomName;

    String StrtingTime;
    String endTime;

    public BookConferenceRoom(Building buildingName, Floor floorName, Room roomName, String strtingTime, String endTime) {
        this.buildingName = buildingName;
        this.floorName = floorName;
        this.roomName = roomName;
        StrtingTime = strtingTime;
        this.endTime = endTime;
    }

    public Building getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(Building buildingName) {
        this.buildingName = buildingName;
    }

    public Floor getFloorName() {
        return floorName;
    }

    public void setFloorName(Floor floorName) {
        this.floorName = floorName;
    }

    public Room getRoomName() {
        return roomName;
    }

    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }

    public String getStrtingTime() {
        return StrtingTime;
    }

    public void setStrtingTime(String strtingTime) {
        StrtingTime = strtingTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}



