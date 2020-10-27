package main.lesson7.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> list = new MyArrayList<>();
        list.add(1,"ololo");
        list.add(2,"ololo1");
        list.add(3,"ololo2");
        list.add(4,"ololo3");
         list.get(1);
         list.contains("ololo1");
        list.contains("ololo10");
        list.size();
        list.add("ol");

    }



}
