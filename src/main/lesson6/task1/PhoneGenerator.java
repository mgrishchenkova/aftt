package main.lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", randomPhone(3), randomPhone(3), randomPhone(2), randomPhone(2));
    }

    private static String randomPhone(int length) {
        String pattern = "0123456789";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
