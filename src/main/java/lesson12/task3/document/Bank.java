package lesson12.task3.document;

import java.util.Objects;

public class Bank {
    private Integer id;
    private Integer version;
    private String bic;
    private Object place;
    private String name;
    private Object placeType;

    public Bank(Integer id, Integer version, String bic, Object place, String name, Object placeType) {
        this.id = id;
        this.version = version;
        this.bic = bic;
        this.place = place;
        this.name = name;
        this.placeType = placeType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(id, bank.id) &&
                Objects.equals(version, bank.version) &&
                Objects.equals(bic, bank.bic) &&
                Objects.equals(place, bank.place) &&
                Objects.equals(name, bank.name) &&
                Objects.equals(placeType, bank.placeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, bic, place, name, placeType);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPlaceType() {
        return placeType;
    }

    public void setPlaceType(Object placeType) {
        this.placeType = placeType;
    }
}
