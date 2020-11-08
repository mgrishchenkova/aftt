package main.lesson9.task3;

public class RightTriangle extends TwoParameterFigure{
    @Override
    public double getArea() {
        return 0.5*c*b;
    }

    @Override
    public double getLength() {
        return c+b+getHypotenuse();
    }

    public double getHypotenuse(){
        return Math.sqrt(c*c+b*b);
    }
}
