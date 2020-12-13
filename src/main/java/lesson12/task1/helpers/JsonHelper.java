package lesson12.task1.helpers;

import com.google.gson.Gson;
import lesson12.task1.model.Generatable;
import org.apache.poi.ss.formula.functions.T;

public class JsonHelper implements SerializeHelper{


    @Override
    public Generatable deserialize(String data, Class clazz) {
        return (Generatable) new Gson().fromJson(data,clazz);
    }



    @Override
    public String serialize(Generatable object) {
        return new Gson().fromJson(object);
    }
}