package lesson9.task4;

import java.util.List;

public interface CookChooser {
    Cooker chooseCooker(List<Cooker> cookers);

    void addFood(Food food, List<Cooker> cookers);
}
