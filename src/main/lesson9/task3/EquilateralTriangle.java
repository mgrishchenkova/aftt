package main.lesson9.task3;

public class EquilateralTriangle extends OneParameterFigure{
    @Override
    public double getArea() {
        return a*a*Math.sqrt(3)/4;
    }

    @Override
    public double getLength() {
        return 3*a;
    }
}
