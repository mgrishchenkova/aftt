package lesson12.task3.document;

import java.util.Objects;

public class CashQuantity {
    private Integer quantity;
    private Cash cash;

    public CashQuantity(Integer quantity, Cash cash) {
        this.quantity = quantity;
        this.cash = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashQuantity that = (CashQuantity) o;
        return Objects.equals(quantity, that.quantity) &&
                Objects.equals(cash, that.cash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, cash);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }
}
