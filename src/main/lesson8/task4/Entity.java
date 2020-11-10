package main.lesson8.task4;

public abstract class Entity implements Validatable {
    String uuid;
    String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }
}
