package lesson9.task4;

import java.util.List;
import java.util.concurrent.Callable;

public class BusyTimeDistributor extends Distributor {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxTime = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker cooker : cookers) {
            if (cooker.foodTime() > maxTime) {
                maxTime = cooker.foodTime();
                candidate = cooker;
            }
        }
        return candidate;
    }

}
