package lesson9.task3;

public class Circle extends OneParameterFigure{

    public Circle() {

    }

    @Override
    public double getArea() {
        return Math.PI*a*a ;
    }

    @Override
    public double getLength() {
        return 2*Math.PI*a;
    }
}
