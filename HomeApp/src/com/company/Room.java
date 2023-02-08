package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {
    String roomType;
    List<String> devices;
    boolean isActive;

    public Room(String roomType) {
        this.roomType = roomType;
        this.devices = new ArrayList<String>();
    }

    public String getRoomType() {
        return roomType;
    }

    public List<String> getDevices() {
        return devices;
    }

    public boolean isActive() {
        return isActive;
    }

    // Add Device
    public void addDevice(String device) {
        devices.add(device);
    }

    // On-Off Device
    public void turnOnDevice(String device) {
        if (devices.contains(device)) {
            isActive = true;
            System.out.println("Device gets on successfully");
        } else {
            System.out.println(device + " is not in " + roomType + " room.");
            System.out.println();
        }
    }

    public void turnOffDevice(String device) {
        if (devices.contains(device)) {
            isActive = false;
            System.out.println("Device gets off successfully");
        } else {
            System.out.println(device + " is not in " + roomType + " room.");
            System.out.println();
        }
    }
}

