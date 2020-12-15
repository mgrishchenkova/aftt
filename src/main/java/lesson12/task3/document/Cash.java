package lesson12.task3.document;

import java.util.Objects;

public class Cash {
    private Integer id;
    private Integer version;
    private Object currencyNumericCodeIso;
    private Double nominal;
    private String description;
    private Boolean isCoin;

    public Cash(Integer id, Integer version, Object currencyNumericCodeIso, Double nominal, String description, Boolean isCoin) {
        this.id = id;
        this.version = version;
        this.currencyNumericCodeIso = currencyNumericCodeIso;
        this.nominal = nominal;
        this.description = description;
        this.isCoin = isCoin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return Objects.equals(id, cash.id) &&
                Objects.equals(version, cash.version) &&
                Objects.equals(currencyNumericCodeIso, cash.currencyNumericCodeIso) &&
                Objects.equals(nominal, cash.nominal) &&
                Objects.equals(description, cash.description) &&
                Objects.equals(isCoin, cash.isCoin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, currencyNumericCodeIso, nominal, description, isCoin);
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

    public Object getCurrencyNumericCodeIso() {
        return currencyNumericCodeIso;
    }

    public void setCurrencyNumericCodeIso(Object currencyNumericCodeIso) {
        this.currencyNumericCodeIso = currencyNumericCodeIso;
    }

    public Double getNominal() {
        return nominal;
    }

    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCoin() {
        return isCoin;
    }

    public void setCoin(Boolean coin) {
        isCoin = coin;
    }
}
