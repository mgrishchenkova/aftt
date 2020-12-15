package lesson12.task3.document;

import java.util.Objects;

public class Currency {
    private Integer id;
    private Integer version;
    private String alphabeticCode;
    private String numericCode;
    private String okvName;

    public Currency(Integer id, Integer version, String alphabeticCode, String numericCode, String okvName) {
        this.id = id;
        this.version = version;
        this.alphabeticCode = alphabeticCode;
        this.numericCode = numericCode;
        this.okvName = okvName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(id, currency.id) &&
                Objects.equals(version, currency.version) &&
                Objects.equals(alphabeticCode, currency.alphabeticCode) &&
                Objects.equals(numericCode, currency.numericCode) &&
                Objects.equals(okvName, currency.okvName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, alphabeticCode, numericCode, okvName);
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

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getOkvName() {
        return okvName;
    }

    public void setOkvName(String okvName) {
        this.okvName = okvName;
    }
}
