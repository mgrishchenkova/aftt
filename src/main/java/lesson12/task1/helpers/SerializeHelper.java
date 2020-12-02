package lesson12.task1.helpers;

public interface SerializeHelper {
    T deserialize(String data, Class<T> clazz);
    String serialize(T object);

}
