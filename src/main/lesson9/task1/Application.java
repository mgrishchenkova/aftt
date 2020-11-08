package main.lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            objectList.add(Generator.generate());

        }

        for (Object object: objectList){
            Action.action(object);
        }
    }
}
