package main.lesson4.task4;

public class Passport {
    String series;
    String number;
    private static int i = 0;
    private static Passport[] unPassport = new Passport[40];

    Passport() {

    }

    public Passport setSeries(String series) {


        if (series.matches("^\\d{4}$") && number== null)
            this.series = series;
        if (number != null & proverka(series, number)) {
            this.series = series;
            unPassport[i++] = this;

        }
        return this;
    }

    public Passport setNumber(String number) {
        if (number.matches("^\\d{6}$") && series== null)
            this.number = number;
        if (series != null & proverka(series, number)) {
            this.number = number;
            unPassport[i++] = this;

        }
        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    private static boolean proverka(String series, String number) {
        for (Passport pass : unPassport) {
            if (pass == null) return true;
            else {
                if (pass.setNumber(number).equals(number) & pass.setSeries(series).equals(series)) return false;
            }

        }

        return true;
    }
}


