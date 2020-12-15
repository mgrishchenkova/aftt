package lesson12.task3.project;

import java.util.Objects;

public class Permission {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    public Permission() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Permission setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }


}
