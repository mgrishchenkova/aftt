package lesson12.task1;

import lesson12.task1.application.Flat;
import lesson12.task1.application.House;
import lesson12.task1.application.Room;
import lesson12.task1.helpers.JsonHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class TestDesJson {
    JsonHelper jsonHelper=new JsonHelper();
    @Test
    void testDesJsonRom() throws IOException {
        String json = String.join("", Files.lines(Paths.get("src/test/java/lesson12/task1/room.json"), Charset.forName("windows-1251")).collect(Collectors.toList()));
        Room room = (Room) jsonHelper.deserialize(json, Room.class);
        Assertions.assertEquals(6, room.getWidth());
        Assertions.assertEquals(5, room.getHeight());
    }
    @Test
    void testDesRom() throws IOException {
        String json = String.join("", Files.lines(Paths.get("src/test/java/lesson12/task1/room.json"), Charset.forName("windows-1251")).collect(Collectors.toList()));
        Flat flat = (Flat) jsonHelper.deserialize(json,Flat.class);
        Assertions.assertEquals(4,flat.getRooms().get(0).getWidth());

    }
    @Test
    void testSerHouse() throws IOException {
        String json = String.join("", Files.lines(Paths.get("src/test/java/lesson12/task1/room.json"), Charset.forName("windows-1251")).collect(Collectors.toList()));
        House house = (House) jsonHelper.deserialize(json,House.class);
        Assertions.assertEquals(3,house.getFlats().get(0).getRooms().get(0).getWidth());

    }
}
