package lesson12.task3.document;

import java.util.Objects;

public class IdentityDocType {
    private Integer id;
    private Integer version;
    private Integer code;
    private MultiLang name;
    private String seriesPresence;
    private String issueSubdivisionPresence;

    public IdentityDocType(Integer id, Integer version, Integer code, MultiLang name, String seriesPresence, String issueSubdivisionPresence) {
        this.id = id;
        this.version = version;
        this.code = code;
        this.name = name;
        this.seriesPresence = seriesPresence;
        this.issueSubdivisionPresence = issueSubdivisionPresence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentityDocType that = (IdentityDocType) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(seriesPresence, that.seriesPresence) &&
                Objects.equals(issueSubdivisionPresence, that.issueSubdivisionPresence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, code, name, seriesPresence, issueSubdivisionPresence);
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public MultiLang getName() {
        return name;
    }

    public void setName(MultiLang name) {
        this.name = name;
    }

    public String getSeriesPresence() {
        return seriesPresence;
    }

    public void setSeriesPresence(String seriesPresence) {
        this.seriesPresence = seriesPresence;
    }

    public String getIssueSubdivisionPresence() {
        return issueSubdivisionPresence;
    }

    public void setIssueSubdivisionPresence(String issueSubdivisionPresence) {
        this.issueSubdivisionPresence = issueSubdivisionPresence;
    }
}
