package lesson14.helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lesson14.model.Person;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class JsonHelper {

    public static List<Person> getPersonsFromFile(String path) {
        try {
            // читаем json
            String json= String.join("", Files.lines(Paths.get(path), Charset.forName("windows-1251")).
                    collect(Collectors.toList()));
            // конвертим json
            List<Person> persons = new Gson().fromJson(json, new TypeToken<List<Person>>() {
            }.getType());
            return persons;

        } catch (IIOException ex) {

            ex.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
