package main.lesson5.task5;

public class Passport {
    String series;
    String number;

    Passport(String series, String number){
       String regexSeries="^(\\d{4})$";
               String regexNumber="^(\\d{6})$";
        try {
            if (series.matches(regexSeries) & number.matches(regexNumber)){
                this.number=number;
                this.series=series;

            }
        } catch (NullPointerException exception){
            System.out.println("Некорректно введены параметры паспорта");
        }
    }

    public String getSeries(){
        if ( series== null){
            throw new NullPointerException();
        }
        return series;
    }

    public String getNumber (){
        if ( number== null){
            throw new NullPointerException();
        }
        return number;
    }
}
