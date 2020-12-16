package lesson12.task1;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lesson12.task1.application.House;
import lesson12.task1.helpers.JsonHelper;
import lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestSerXml {
    @Test
    void testSerXml() throws IOException {
        XmlHelper helper = new XmlHelper();
        String EXPECTED_RESULT_FILE_PATH = "src/test/java/lesson12/task1/expected_xml.txt";
        House house = new House().generate();
        String actualHouseXml = helper.serialize(house);
        String expectedHouseXml = Files.readAllLines(Paths.get(EXPECTED_RESULT_FILE_PATH)).get(0);
        Assertions.assertEquals(expectedHouseXml, actualHouseXml);
    }
}
