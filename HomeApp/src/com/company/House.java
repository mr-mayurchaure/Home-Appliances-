package com.company;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<Room>();
    }

    // Add Room
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }



    public Room getRoomByType(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType)) {
                return room;
            }
        }
        return null;
    }

    // Turn on Device
    public void turnOnDevice(String roomType, String device) {
        Room room = getRoomByType(roomType);
        if (room != null) {
            room.turnOnDevice(device);
        } else {
            System.out.println(roomType + " room not found in house.");
        }
    }

    // turn Off Device
    public void turnOffDevice(String roomType, String device) {
        Room room = getRoomByType(roomType);
        if (room != null) {
            room.turnOffDevice(device);
        } else {
            System.out.println(roomType + " room not found in house.");
        }
    }
}
