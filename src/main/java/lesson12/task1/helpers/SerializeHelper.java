package lesson12.task1.helpers;

import lesson12.task1.model.Generatable;
import org.apache.poi.ss.formula.functions.T;

public interface SerializeHelper<T extends Generatable> {
    T deserialize(String data, Class<T> clazz);
    String serialize(T object);

}
