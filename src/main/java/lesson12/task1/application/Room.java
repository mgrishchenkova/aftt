package lesson12.task1.application;

import lesson12.task1.model.Generatable;

public class Room implements Generatable {
    int width;
    int height;

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Room() {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Generatable generate() {

        width = 5;
        height = 3;
        return this;
    }
}
