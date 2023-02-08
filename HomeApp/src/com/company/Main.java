package com.company;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        Room kitchen = new Room("Kitchen");
        kitchen.addDevice("Refrigerator");
        kitchen.addDevice("Microwave");
        house.addRoom(kitchen);

        Room livingArea = new Room("Living Area");
        livingArea.addDevice("Sofa");
        livingArea.addDevice("Television");
        house.addRoom(livingArea);

        Room bedRoom = new Room("BedRoom");
        bedRoom.addDevice("Sofa");
        bedRoom.addDevice("Television");
        bedRoom.addDevice("Charger");
        house.addRoom(bedRoom);
        
        for (Room room : house.getRooms()) {
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Devices: " + room.getDevices());
        }
    }
}