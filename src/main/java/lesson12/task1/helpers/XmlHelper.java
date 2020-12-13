package lesson12.task1.helpers;

import lesson12.task1.model.Generatable;
import org.apache.poi.ss.formula.functions.T;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlHelper implements SerializeHelper {

    @Override
    public Generatable deserialize(String data, Class clazz) {

    }

    @Override
    public String serialize(Generatable object) {
        return null;
    }
}
