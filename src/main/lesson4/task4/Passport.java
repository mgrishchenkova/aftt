package main.lesson4.task4;

public class Passport {
    String series;
    String number;

    Passport() {

    }

    public void setSeries(String series) {
       this.series=series;
        int result = series.length();
        if (result==4)
        System.out.println("валидна");
        else  System.out.println("невалидна");

    }

    public void setNumber(String number) {
        this.number=number;
        int result = number.length();
        if (result== 6)

        System.out.println("Номер валиден");
         else  System.out.println("невалиден");
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

}
