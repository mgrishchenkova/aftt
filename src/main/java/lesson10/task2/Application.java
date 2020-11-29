package lesson10.task2;

import java.util.ArrayList;
import java.util.List;

import static lesson10.task2.FileHelper.write;

public class Application {
    public static void main(String[] args) {
        List<String> generatedContent = new ArrayList<>();

        for (int i = 0; i < Config.LINES_AMOUNT; i++) {
            generatedContent.add(StringHelper.generate());
        }

        write(generatedContent);
    }
}
