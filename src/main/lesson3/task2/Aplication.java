package main.lesson3.task2;


import java.util.Arrays;

public class Aplication {
    public static void main (String[] args){
        Cat[] cat = new Cat[5];
        cat[0] = new Cat(2, 5, "Барсик");
        cat[1] = new Cat(3, 11, "Мурзик");
        cat[2] = new Cat(7, 2, "Матильда");
        cat[3] = new Cat(1, 3, "Леопольд");
        cat[4] = new Cat(11, 4, "Базилио");
String[] arrayCats = {cat[0].name,cat[1].name,cat[2].name,cat[3].name,cat[4].name};
        Arrays.sort(arrayCats);

        //вывод массива
        for (String sortedName : arrayCats) {
            for (Cat cats : cat) {
                if (cats.name.equals(sortedName))
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cats.name, cats.age, cats.weight);
            }
        }

    }
}
