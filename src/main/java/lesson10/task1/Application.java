package lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        Map<String, String> data = FileHelper.readFile(
                new File("src/main/lesson10/task1/input")
        );

        FileHelper.saveFile(
                new File("src\\main\\lesson10\\task1\\output.json"),
                data
        );

    }
}
