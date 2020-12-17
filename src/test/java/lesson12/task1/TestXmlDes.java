package lesson12.task1;

import lesson12.task1.application.Flat;
import lesson12.task1.application.House;
import lesson12.task1.application.Room;
import lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestXmlDes {


   @Test
    void  testDesRoom() throws IOException {
        XmlHelper helper = new XmlHelper();
        String xml = String.join("", Files.readAllLines(Paths.get("src/test/java/lesson12/task1/room.xml")));
        Room room = (Room) helper.deserialize(xml, Room.class);
        Assertions.assertEquals(6, room.getWidth());
        Assertions.assertEquals(5, room.getHeight());
    }

    @Test
    void testDesFlat() throws IOException {
        XmlHelper helper = new XmlHelper();
        String xml = String.join("", Files.readAllLines(Paths.get("src/test/java/lesson12/task1/flat.xml")));
        Flat flat = (Flat) helper.deserialize(xml, Flat.class);
        Assertions.assertEquals(3, flat.getRooms().size());
        Assertions.assertEquals(4, flat.getRooms().get(0).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(0).getHeight());
        Assertions.assertEquals(6, flat.getRooms().get(1).getWidth());
        Assertions.assertEquals(5, flat.getRooms().get(1).getHeight());
        Assertions.assertEquals(2, flat.getRooms().get(2).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(2).getHeight());
    }

    @Test
    void testDesHouse() throws IOException {
        XmlHelper helper = new XmlHelper();
        String json = String.join("", Files.readAllLines(Paths.get("src/test/java/lesson12/task1/house.xml")));
        House house = (House) helper.deserialize(json, House.class);
        Assertions.assertEquals(3, house.getFlats().size());
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(0).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(0).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(1).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(1).getHeight());
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(5, house.getFlats().get(1).getRooms().get(0).getWidth());
        Assertions.assertEquals(6, house.getFlats().get(1).getRooms().get(0).getHeight());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());
        Assertions.assertEquals(2, house.getFlats().get(2).getRooms().get(0).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(0).getHeight());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(1).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(1).getHeight());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getWidth());
        Assertions.assertEquals(8, house.getFlats().get(2).getRooms().get(2).getHeight());
    }
}
