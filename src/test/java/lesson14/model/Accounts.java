package lesson14.model;

public class Accounts {
    private String accountType;
    private String accountNumber;
    private Double accountBalance;

    public Accounts(String accountType, String accountNumber, double accountBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
