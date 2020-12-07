package lesson14.model;

public class Cards {
   private String type;
   private  String cardNumber;
   private int endDateMonth;
   private int endDateYear;
   private int code;
   private int accountNumber;

    public Cards(String type, String cardNumber, int endDateMonth, int endDateYear, int code, int accountNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.endDateMonth = endDateMonth;
        this.endDateYear = endDateYear;
        this.code = code;
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getEndDateMonth() {
        return endDateMonth;
    }

    public void setEndDateMonth(int endDateMonth) {
        this.endDateMonth = endDateMonth;
    }

    public int getEndDateYear() {
        return endDateYear;
    }

    public void setEndDateYear(int endDateYear) {
        this.endDateYear = endDateYear;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
