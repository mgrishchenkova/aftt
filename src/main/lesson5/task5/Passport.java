package main.lesson5.task5;

public class Passport {
    String series;
    String number;
    private static final Passport[] passports = new Passport[100];
    private static int index = 0;

    Passport(String series, String number) throws PassportIllegalArgumentException, PassportAlreadyExistsException, PassportNullPointerException,NullPointerException{
       String regexSeries="^(\\d{2})-(\\d{2})$";
               String regexNumber="^(\\d{6})$";
        if (series==null) throw new PassportSeriesNullPointerException();
        if (number==null) throw  new PassportNumberNullPointerException();
            if (!series.matches(regexSeries)) throw new PassportSeriesArgumentException();
            if (!number.matches(regexNumber)) throw new PassportNumberArgumentException();

        for (Passport passport : passports) {
            if (passport == null) break;
            if (passport.series.equals(series) && passport.number.equals(number))
                throw new PassportAlreadyExistsException();
        }
        this.series = series;
        this.number = number;
        passports[index++] = this;
        System.out.printf("Паспорт с серией %s и номером %s успешно создан%n", series, number);

            }


    public String getSeries(){

        return series;
    }

    public String getNumber (){
        return number;
    }
}
