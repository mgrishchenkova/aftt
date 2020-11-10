package main.lesson8.task4;

import java.util.Objects;

public class Branch extends Entity{
    String address;
    public Branch(String name, String address) {
        super(name);
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return address.equals(branch.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
