package lesson14.model;

public class Passport {

    private String series;
    private String number;
    private String issuer;
    private String issueDate;
    private String issueCode;

    public Passport(String series, String number, String issuer, String issueDate, String issueCode) {
        this.series = series;
        this.number = number;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.issueCode = issueCode;
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

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }
}
