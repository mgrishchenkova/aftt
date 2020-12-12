package lesson11.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

public class TestMethods {
    @Test
    void testMethods() {
        String path = "src/main/java/lesson11/task4/persons.xlsx";
        String sheetName1 = "Persons1";
        String sheetName2 = "Persons2";
        String sheetName3 = "ololo";
        String path1 = "lesson11/task3";
        List<Person> personList = FileHelper.getPersonsFromExcel(path, sheetName1);
      //  List<Person> personList2 = FileHelper.getPersonsFromExcel(path, sheetName2);
      //  List<Person> personList3 = FileHelper.getPersonsFromExcel(path, sheetName3);
       // List<Person> personList4 = FileHelper.getPersonsFromExcel(path1, sheetName1);
        Assertions.assertEquals(6, personList.size());
        //Assertions.assertEquals(5, personList.size());
        //Assertions.assertNull(personList3);
        //Assertions.assertNull(personList4);


    }
}
