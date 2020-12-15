package lesson12.task2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Helper {

    private static List<Map<String, String>> getDataForExsel(Sheet sheet){
        int index = 0;
        final List<String> key = new ArrayList<>();
        final List<Map<String, String>> dataExsel = new ArrayList<>();
        Row first = sheet.getRow(0);
        for (Cell rowFirst : first)
            key.add(rowFirst.getStringCellValue());

        for (Row row : sheet)
            if (index++ != 0) {
                int keyIndex = 0;
                Map<String, String> data = new TreeMap<>();
                for (Cell cell : row) {
                    String keys = key.get(keyIndex++);
                    String value = cell.getStringCellValue();
                    data.put(keys, value);
                }
                dataExsel.add(data);
            }
            return dataExsel;
        }


    public static String getJsonArrayFromXls(String path, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(new File(path));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        List<Map<String, String>> data = getDataForExsel(sheet);
        JsonArray json = new JsonArray();
        for (Map<String, String> value : data) {
            JsonObject object = new JsonObject();
            for (Map.Entry<String, String> entry : value.entrySet())
                object.addProperty(entry.getKey(), entry.getValue());
            json.add(object);
        }
        return json.toString();

    }


    public static String getXmlFromXls(String path, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(new File(path));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        List<Map<String, String>> data = getDataForExsel(sheet);
        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(data);
    }

}
