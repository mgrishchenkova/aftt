package main.lesson9.task4;

import java.util.List;

public abstract class Distributor implements CookChooser {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        return null;
    }

    @Override
    public void addFood(Food food, List<Cooker> cookers) {

    }
}
