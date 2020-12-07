package lesson14.model;

public class Passport {

    private int series;
    private int number;
    private String issuer;
    private String issueDate;
    private String issueCode;

    public Passport(int series, int number, String issuer, String issueDate, String issueCode) {
        this.series = series;
        this.number = number;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.issueCode = issueCode;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
