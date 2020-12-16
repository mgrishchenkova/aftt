package lesson12.task1.helpers;

import com.fasterxml.jackson.databind.JsonMappingException;
import lesson12.task1.model.Generatable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlHelper implements SerializeHelper {

    @Override
    public Generatable deserialize(String data, Class clazz) {
        XmlMapper mapXml = new XmlMapper();
        try {
            return (Generatable) mapXml.readValue(data, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Невозможно десериализовать объект");

        }

    }

    @Override
    public String serialize(Generatable object) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            return xmlMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Невозможно сериализовать объект");
        }
    }
}
