package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomType;
    private List<String> devices;

    public Room(String roomType) {
        this.roomType = roomType;
        this.devices = new ArrayList<String>();
    }

    public String getRoomType() {
        return roomType;
    }

    public void addDevice(String device) {
        devices.add(device);
    }

    public List<String> getDevices() {
        return devices;
    }
}
