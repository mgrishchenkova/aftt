package lesson12.task3.document;

import java.util.Objects;

public class Client {
    private Integer id;
    private Integer version;
    private String inn;
    private String shortName;
    private String ogrn;

    public Client(Integer id, Integer version, String inn, String shortName, String ogrn) {
        this.id = id;
        this.version = version;
        this.inn = inn;
        this.shortName = shortName;
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(version, client.version) &&
                Objects.equals(inn, client.inn) &&
                Objects.equals(shortName, client.shortName) &&
                Objects.equals(ogrn, client.ogrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, inn, shortName, ogrn);
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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }
}
