package lesson9.task3;

public class Rectangle extends TwoParameterFigure {
    @Override
    public double getArea() {
        return c * b;
    }

    @Override
    public double getLength() {
        return 2 * (c + b);
    }
}
