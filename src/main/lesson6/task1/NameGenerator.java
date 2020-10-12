package main.lesson6.task1;

import java.util.Random;

public class NameGenerator {

    private static final int numberOne = 'А';
    private static final int numberOneEnd = 'Я';
    private static final int number1 = 'а';
    private static final int number2 = 'я';

    public static String generate() {
        StringBuffer sb = new StringBuffer().append(randomChar(numberOne,numberOneEnd));
        int length = new Random().nextInt(5) + 7; // От 5 до 12 символов. Первый символ создается в new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomChar(number1, number2));
        }
        return sb.toString();
    }

    private static char randomChar(int min, int max) {

        return (char) (new Random().nextInt(max - min) + min);
    }

}
