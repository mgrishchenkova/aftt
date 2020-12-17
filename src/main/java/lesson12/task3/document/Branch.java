package lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Branch {
    private Integer id;
    private Integer version;
    private Branch headBranch;
    private String bic;
    private String shortName;
    private String timeZone;
    private List<Object> branchAddresses;
    private Boolean currencyTrifle;
    private String code_TFU;

    public Branch(Integer id, Integer version, Branch headBranch, String bic, String shortName, String timeZone, List<Object> branchAddresses, Boolean currencyTrifle, String code_TFU) {
        this.id = id;
        this.version = version;
        this.headBranch = headBranch;
        this.bic = bic;
        this.shortName = shortName;
        this.timeZone = timeZone;
        this.branchAddresses = branchAddresses;
        this.currencyTrifle = currencyTrifle;
        this.code_TFU = code_TFU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(id, branch.id) &&
                Objects.equals(version, branch.version) &&
                Objects.equals(headBranch, branch.headBranch) &&
                Objects.equals(bic, branch.bic) &&
                Objects.equals(shortName, branch.shortName) &&
                Objects.equals(timeZone, branch.timeZone) &&
                Objects.equals(branchAddresses, branch.branchAddresses) &&
                Objects.equals(currencyTrifle, branch.currencyTrifle) &&
                Objects.equals(code_TFU, branch.code_TFU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, headBranch, bic, shortName, timeZone, branchAddresses, currencyTrifle, code_TFU);
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

    public Branch getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(Branch headBranch) {
        this.headBranch = headBranch;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public List<Object> getBranchAddresses() {
        return branchAddresses;
    }

    public void setBranchAddresses(List<Object> branchAddresses) {
        this.branchAddresses = branchAddresses;
    }

    public Boolean getCurrencyTrifle() {
        return currencyTrifle;
    }

    public void setCurrencyTrifle(Boolean currencyTrifle) {
        this.currencyTrifle = currencyTrifle;
    }

    public String getCode_TFU() {
        return code_TFU;
    }

    public void setCode_TFU(String code_TFU) {
        this.code_TFU = code_TFU;
    }
}
