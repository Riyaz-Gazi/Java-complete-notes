package oop.relationship.composition;

import java.util.ArrayList;
import java.util.List;

class Room {
    String name;
    public Room(String name) {
        this.name = name;
    }
}

class House{
    List<Room> rooms;

    public House(){
        rooms = new ArrayList<>();
        rooms.add(new Room("Bed Room"));
        rooms.add(new Room("Living Room"));
    }
}

public class CompositionMain {
    public static void main(String[] args) {
        House house = new House();

        /**
         * A class can have another class within it but owns it - strong relationship
         * if House object deleted rooms object automatically deleted
         */
    }
}
