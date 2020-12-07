package lesson14.helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lesson14.model.Person;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class JsonHelper {

    public static List<Person> getPersonsFromFile(String path) {
        try {
            // читаем json
            String json = String.join("", Files.lines(Paths.get("src/test/java/lesson14/dataset.json"), Charset.forName("windows-1251")).collect(Collectors.toList()));
            // конвертим json
            List<Person> persons = new Gson().fromJson(json, new TypeToken<List<Person>>() {
            }.getType());
            return persons;

        } catch (Exception ex) {
            return null;
        }

    }
}
