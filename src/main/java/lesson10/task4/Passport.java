package lesson10.task4;

import java.util.Properties;
import java.util.Random;

public class Passport implements Generatable {
    private String series;
    private String number;

    @Override
    public Passport generate() {
        series = generateString(Property.PASSPORT_SERIES_DIGITS);
        number = generateString(Property.PASSPORT_NUMBER_DIGITS);
        return this;

    }

    public static String generateString(int length) {
        String symbol = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(symbol.charAt(new Random().nextInt(symbol.length())));
        }
        return sb.toString();
    }
}
