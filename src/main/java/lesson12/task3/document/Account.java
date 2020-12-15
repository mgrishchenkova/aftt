package lesson12.task3.document;

import java.util.Objects;

public class Account {
    private Integer id;
    private Integer version;
    private String accountNumber;
    private String bic;
    private Branch branch;

    public Account(Integer id, Integer version, String accountNumber, String bic, Branch branch) {
        this.id = id;
        this.version = version;
        this.accountNumber = accountNumber;
        this.bic = bic;
        this.branch = branch;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id.equals(account.id) &&
                version.equals(account.version) &&
                accountNumber.equals(account.accountNumber) &&
                bic.equals(account.bic) &&
                branch.equals(account.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, accountNumber, bic, branch);
    }
}
