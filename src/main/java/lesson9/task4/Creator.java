package lesson9.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Creator {

    public static List<Cooker> generateCook(int amount) {
        List<Cooker> cookers = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            cookers.add(new Cooker());
        }
        return cookers;
    }

    public static List<Food> generateFood(int amount) {
        List<Food> foods = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            foods.add(random());
        }
        return foods;
    }

    private static Food random() {
        switch (new Random().nextInt(6)) {
            case 0:
                return new Buckwheat();
            case 1:
                return new Coffee();
            case 2:
                return new Fish();
            case 3:
                return new Meat();
            case 4:
                return new Rice();
            case 5:
                return new Tea();
        }
        return null;
    }
}
