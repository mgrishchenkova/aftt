package lesson12.task1.helpers;

import org.apache.poi.ss.formula.functions.T;

public interface SerializeHelper {
    T deserialize(String data, Class<T> clazz);
    String serialize(T object);

}
