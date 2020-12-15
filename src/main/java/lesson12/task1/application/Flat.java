package lesson12.task1.application;

import lesson12.task1.model.Generatable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flat  implements Generatable {
     private List<Room> rooms;


    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Flat() {

    }
    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public Generatable generate() {
        this.rooms= new ArrayList<>();
        rooms.add(new Room());
        rooms.add(new Room());
        return this;
    }
}
