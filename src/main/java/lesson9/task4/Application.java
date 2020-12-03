package lesson9.task4;

import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        List<Cooker> cookers =Creator.generateCook(new Random().nextInt(6)+5);
        List<Food> foods = Creator.generateFood(10);

        Distributor roundRobinDistributor = new RoundRobinDistributor();
        Distributor busyTimeDistributor = new BusyTimeDistributor();
        for (Food food : foods) {
            roundRobinDistributor.addFood(food, cookers);
        }

        int maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.foodTime())
                maxTime = cooker.foodTime();
        }
        System.out.println("ќбщее врем€ приготовлени€ с использованием RoundRobin:" + maxTime);

        for (Cooker cooker : cookers)
            cooker.clearFood();

        for (Food food : foods) {
            busyTimeDistributor.addFood(food, cookers);
        }

        maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.foodTime())
                maxTime = cooker.foodTime();
        }
        System.out.println("ќбщее врем€ приготовлени€ с использованием BusyTime:" + maxTime);

    }
}
