package lesson9.task3;

public class Square extends OneParameterFigure{
    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getLength() {
        return 2*a;
    }
}
