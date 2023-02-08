package com.company;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
