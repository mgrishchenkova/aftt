package lesson10.task2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {

   private static Properties properties = new Properties();
    public static final File OUTPUT_FILE;
    public static final Integer LINES_AMOUNT;
     public static final Integer LINES_MIN_LENGTH;
     public static final Integer LINES_MAX_LENGTH;
    public static final String LINES_MESSAGE;
     public static final String LINES_PATTERN;


    static {
        loadProperties(properties);

        OUTPUT_FILE = new File(getProperty("output.file","k"));
        LINES_AMOUNT = getIntegerProperty("lines.amount",0);
        LINES_MIN_LENGTH = getIntegerProperty("lines.max.length",1);
        LINES_MAX_LENGTH = getIntegerProperty("lines.min.length",2);
        LINES_MESSAGE = getProperty("lines.message","dc");
        LINES_PATTERN =getProperty("lines.pattern","jj");
    }
    private static void loadProperties(Properties properties) {
        try {
            properties.load(new FileReader("src\\main\\java\\lesson10\\task2\\application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(properties.getProperty(key, defaultValue.toString()));
    }

    private static Integer getIntegerProperty(String key, Integer defaultValue) {
        return Integer.parseInt(properties.getProperty(key, defaultValue.toString()));
    }

    private static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue.toString());
    }
}
