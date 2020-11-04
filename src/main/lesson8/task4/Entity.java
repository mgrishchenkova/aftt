package main.lesson8.task4;

public abstract class Entity extends ValidatorStub {
    String uuid;
    String name;

    public Entity(String name) {
        this.name = name;
    }

}
