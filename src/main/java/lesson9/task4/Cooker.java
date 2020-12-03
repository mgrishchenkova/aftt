package lesson9.task4;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    public List<Food> foodCook = new ArrayList<>();

    public int getFoodCookSize() {
        return foodCook.size();
    }

    public void addFood(Food food) {
        foodCook.add(food);
    }

    public void clearFood() {
        foodCook.clear();
    }

    public int foodTime() {
        int time = 0;
        for (Food foods : foodCook) {
            time = time + foods.getCookingTime();
        }
        return time;
    }
}
