package main.lesson9.task3;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure{
    public int c;
    public int b;

    public int getC() {
        return c;
    }

    public int getB() {
        return b;
    }

    public TwoParameterFigure() {
        this.c = new Random().nextInt(10)+1;
        this.b = new Random().nextInt(10)+1;

    }
}
