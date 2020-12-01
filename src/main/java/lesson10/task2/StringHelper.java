package lesson10.task2;

import java.util.Properties;
import java.util.Random;

public class StringHelper {
    public static String generate() {
        StringBuilder sb = new StringBuilder();
        int LINES_MIN_LENGTH = Config.LINES_MIN_LENGTH;
        int LINES_MAX_LENGTH = Config.LINES_MAX_LENGTH;
        String LINES_PATTERN = Config.LINES_PATTERN;
        int length = new Random().nextInt(LINES_MAX_LENGTH)+LINES_MIN_LENGTH;
        String LINES_MESSAGE = Config.LINES_MESSAGE;

        for (int i =0; i <=length; i++) {
            sb.append(LINES_PATTERN.charAt(new Random().nextInt(LINES_PATTERN.length())));
        }
      String result =  sb.toString();
       System.out.printf(LINES_MESSAGE, result);
        return result;
    }
}
