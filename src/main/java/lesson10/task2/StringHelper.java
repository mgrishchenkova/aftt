package lesson10.task2;

import java.util.Properties;

public class StringHelper {
    public static String generate() {
        StringBuilder sb = new StringBuilder();
        int LINES_MIN_LENGTH = Config.LINES_MIN_LENGTH;
        int LINES_MAX_LENGTH = Config.LINES_MAX_LENGTH;
        String LINES_PATTERN = Config.LINES_PATTERN;
        String LINES_MESSAGE = Config.LINES_MESSAGE;

        for (int i = LINES_MIN_LENGTH; i <= LINES_MAX_LENGTH; i++) {
            sb.append(LINES_PATTERN);
        }
        String result = sb.toString();
        System.out.printf(LINES_MESSAGE, result);
        return result;
    }
}
