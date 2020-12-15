package lesson12.task3.document;

import java.util.Objects;

public class BankAccount {
    private Account account;
    private Bank bank;

    public BankAccount(Account account, Bank bank) {
        this.account = account;
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return account.equals(that.account) &&
                bank.equals(that.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, bank);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
