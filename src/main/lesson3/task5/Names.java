package main.lesson3.task5;

import java.util.Random;

public class Names {
    static String[] namesCat = {"Буся","Муся","Мурзик","Барсик","Бормон"};
    static String[] namesDog={"Полкан","Цезарь","Тузик"};
    static String[] namesHuman={"Василий","Андрей","Анна","Екатерина"};;

    static String randomNameCat(){
        return namesCat[new Random().nextInt(namesCat.length)];

    }
    static String randomNamesDog(){
        return namesDog[new Random().nextInt(namesDog.length)];

    }
    static String randomNamesHuman(){
        return namesHuman[new Random().nextInt(namesHuman.length)];

    }

}
