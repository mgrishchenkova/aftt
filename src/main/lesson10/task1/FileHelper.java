package main.lesson10.task1;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws IOException {
        List<String> content = Files.readAllLines(file.toPath());
        Map<String, String> result = new HashMap<>();
        for (String pair : content) {
            String key = pair.split("=")[0];
            String value = (pair.split("=").length == 2)
                    ? pair.split("=")[1]
                    : null;
            result.put(key, value);

        }
        return result;
    }

    public static void saveFile(File file, Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder().append("{").append(System.lineSeparator());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("\"").append(entry.getKey()).append("\"").append(":").append("\"").
                    append(format(entry.getValue())).append("\"").append(",").append(System.lineSeparator());
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("}");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(sb.toString());
        bufferedWriter.flush();
        bufferedWriter.close();


    }
    private static String format(String string) {
        if (string == null) {
            return "[]";
        }
        if (string.equals("null")) {
            return "null";
        }
        if (string.equalsIgnoreCase("true") || string.equalsIgnoreCase("false")) {
            return string;
        }
        try {
            Double.parseDouble(string);
            return string;
        } catch (RuntimeException ignore) {
        }
        return "\"" + string + "\"";
    }
}
