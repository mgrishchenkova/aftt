package lesson12.task3.document;

import java.util.Objects;

public class IdentityDocument {
    private IdentityDocType identityDocType;
    private String series;
    private String number;
    private String issueDate;
    private String issuer;
    private String issuerSubdivision;
    private String lastName;
    private String firstName;
    private String middleName;

    public IdentityDocument(IdentityDocType identityDocType, String series, String number, String issueDate, String issuer, String issuerSubdivision, String lastName, String firstName, String middleName) {
        this.identityDocType = identityDocType;
        this.series = series;
        this.number = number;
        this.issueDate = issueDate;
        this.issuer = issuer;
        this.issuerSubdivision = issuerSubdivision;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentityDocument that = (IdentityDocument) o;
        return Objects.equals(identityDocType, that.identityDocType) &&
                Objects.equals(series, that.series) &&
                Objects.equals(number, that.number) &&
                Objects.equals(issueDate, that.issueDate) &&
                Objects.equals(issuer, that.issuer) &&
                Objects.equals(issuerSubdivision, that.issuerSubdivision) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityDocType, series, number, issueDate, issuer, issuerSubdivision, lastName, firstName, middleName);
    }

    public IdentityDocType getIdentityDocType() {
        return identityDocType;
    }

    public void setIdentityDocType(IdentityDocType identityDocType) {
        this.identityDocType = identityDocType;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssuerSubdivision() {
        return issuerSubdivision;
    }

    public void setIssuerSubdivision(String issuerSubdivision) {
        this.issuerSubdivision = issuerSubdivision;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
