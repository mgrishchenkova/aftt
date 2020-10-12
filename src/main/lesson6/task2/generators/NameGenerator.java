package main.lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
    private static final int number1 = 'А';
    private static final int number2 = 'Я';
    private static final int numbern = 'а';
    private static final int numberm = 'я';

    public static String generate() {
        StringBuffer sb = new StringBuffer().append(randomChar(number1, number2));
        int dimension = new Random().nextInt(7) + 5;
        {
            for (int i = 0; i < dimension; i++) {
                sb.append(randomChar(numbern, numberm));
            }
        }

        return sb.toString();
    }

    public static char randomChar(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }
}
