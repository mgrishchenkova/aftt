package main.lesson9.task3;

import java.util.Random;

public abstract class OneParameterFigure extends Figure{
    public int a;
    public OneParameterFigure() {
 this.a= new Random().nextInt(10)+1;
    }

    public int getA() {
        return a;
    }
}
