package lesson12.task3.document;

import java.util.Objects;

public class Status {
    private String base;
    private String name;
    private Object extended;
    private Object extendedName;
    private Object comment;

    public Status(String base, String name, Object extended, Object extendedName, Object comment) {
        this.base = base;
        this.name = name;
        this.extended = extended;
        this.extendedName = extendedName;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(base, status.base) &&
                Objects.equals(name, status.name) &&
                Objects.equals(extended, status.extended) &&
                Objects.equals(extendedName, status.extendedName) &&
                Objects.equals(comment, status.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, name, extended, extendedName, comment);
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getExtended() {
        return extended;
    }

    public void setExtended(Object extended) {
        this.extended = extended;
    }

    public Object getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(Object extendedName) {
        this.extendedName = extendedName;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }
}
