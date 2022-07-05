package com.dmdev.oop.homework1;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }


    public void print(){
        System.out.println("Flat: " + flatNumber + " Rooms count: " + rooms.length);

        for (Room room : rooms) {
            System.out.println("Room is passage: " + room.IsPassage);
              }
    }

}