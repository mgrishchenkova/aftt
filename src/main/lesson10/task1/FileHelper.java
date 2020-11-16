package main.lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {
    File inputFile = new File("src\\main\\lesson10\\task1\\input.txt");

    public Map<String, String> readFile(File file) throws IOException {
        List<String> contetnt = Files.readAllLines(file.toPath());
        Map<String, String> result = new HashMap<>();
        for (String pair : contetnt) {
String key = pair.split("=")[0];
String value = (pair.split("=").length==2)
        ? pair.split("=")[1]
        : null;
            result.put(key, value);

        }
        return result;
    }


    //saveFile(File file, <Коллекция>);
}
