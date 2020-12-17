package lesson12.task1;

import lesson12.task1.application.House;
import lesson12.task1.helpers.JsonHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestSerJson {


    @Test
    void testSerJson() throws IOException {
        JsonHelper helper = new JsonHelper();
        House house = new House().generate();
        String actual = helper.serialize(house);
        String expected = Files.readAllLines(Paths.get("src/test/java/lesson12/task1/expected_json.txt")).get(0);
        Assertions.assertEquals(expected, actual);
    }
}
