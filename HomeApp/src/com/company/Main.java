package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        while (true) {
            System.out.println("1. Check rooms and devices");
            System.out.println("2. Turn on/off device");
            System.out.println("3. Check the status of room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 4) {
                break;
            }
            switch (option) {
                case 1:
                    Room kitchen = new Room("Kitchen");
                    kitchen.addDevice("Gas-System");
                    kitchen.addDevice("Washing-Machine");
                    kitchen.addDevice("Air-Con.");
                    house.addRoom(kitchen);

                    Room livingArea = new Room("Living-Area");
                    livingArea.addDevice("Television");
                    livingArea.addDevice("TV-Remote");
                    livingArea.addDevice("Air-Con.");
                    house.addRoom(livingArea);

                    Room bedRoom = new Room("BedRoom");
                    bedRoom.addDevice("Television");
                    bedRoom.addDevice("Charger");
                    bedRoom.addDevice("Air-Con.");
                    house.addRoom(bedRoom);

                    for (Room room : house.getRooms()) {
                        System.out.println("Room Type: " + room.getRoomType());
                        System.out.println("Devices: " + room.getDevices());
                        System.out.println();
                    }

                    int numOfRooms = house.getRooms().size();
                    System.out.println("In the house there are " + numOfRooms + " rooms.");
                    System.out.println();
                    break;

                case 2:
                    while (true) {
                        System.out.println();
                        System.out.println("Device turn on/off: ");
                        System.out.println("1. Turn on device");
                        System.out.println("2. Turn off device");
                        System.out.println("3. Go back ");
                        System.out.print("Enter your choice: ");
                        int onOff = scanner.nextInt();
                        System.out.println();
                        if (onOff == 3) {
                            break;
                        }

                        switch (onOff) {
                            case 1:
                                System.out.print("Enter RoomType: ");
                                String selectRoomType = scanner.next();
                                System.out.print("Enter Device: ");
                                String selectDevice = scanner.next();
                                house.turnOnDevice(selectRoomType, selectDevice);
                                break;
                            case 2:
                                System.out.print("Enter RoomType: ");
                                selectRoomType = scanner.next();
                                System.out.print("Enter Device: ");
                                selectDevice = scanner.next();
                                house.turnOffDevice(selectRoomType, selectDevice);
                                break;

                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println();
                        System.out.println("To check the status of each room and the devices in it, Fill the details: ");
                        System.out.print("Enter RoomType: ");
                        String selectRoomType = scanner.next();
                        System.out.print("Enter Device: ");
                        String selectDevice = scanner.next();

                        house.roomStatus(selectRoomType);
                        Room room = new Room();
                        room.deviceStatus(selectDevice);

                        break;

                    }

            }
        }
    }
}