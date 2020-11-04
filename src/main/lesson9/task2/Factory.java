package main.lesson9.task2;

import java.util.Random;

public class Factory {

    public static Car make() {
        int randomPercent = new Random().nextInt(101);
        if (randomPercent >= 0 && randomPercent <= 40)
            return new Renault();
        else if (randomPercent > 40 && randomPercent <= 70)
            return new Nissan();
        else if (randomPercent > 70 && randomPercent < 90)
            return new Mitsubishi();
        else if (randomPercent >= 90)
            return new Mercedes();
        throw new IllegalArgumentException();

    }
}
