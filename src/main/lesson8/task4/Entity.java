package main.lesson8.task4;

public abstract class Entity implements Validatable {
    protected String uuid;
    protected String name;

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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
