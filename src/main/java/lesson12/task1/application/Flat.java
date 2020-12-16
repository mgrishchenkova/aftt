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
    public Flat generate() {
        this.rooms=Arrays.asList(new Room().generate(),new Room().generate());
        return this;
    }
}
