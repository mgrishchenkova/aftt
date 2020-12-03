package lesson9.task3;

public class Ellipse extends TwoParameterFigure{
    @Override
    public double getArea() {
        return Math.PI*c*b;
    }

    @Override
    public double getLength() {
        return Math.PI*(c+b);
    }
}
