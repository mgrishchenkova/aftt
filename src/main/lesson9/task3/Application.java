package main.lesson9.task3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generateFigure());
        }
        for (Figure figure : figures) {
            if (Generator.generateFigure() instanceof OneParameterFigure) {
                OneParameterFigure oneParameterFigure = (OneParameterFigure) figure;
                System.out.printf("Класс фигуры %s [%s] Длина - %s, Площадь - %s%n", figure.getClass().getSimpleName(), oneParameterFigure.getA(), figure.getLength(), figure.getArea());
            }

            if (Generator.generateFigure() instanceof TwoParameterFigure) {
              TwoParameterFigure twoParameterFigure = (TwoParameterFigure) figure;
            System.out.printf("Класс фигуры %s [%s, %s]: Длина - %s, Площадь - %s%n", figure.getClass().getSimpleName(), twoParameterFigure.getC(), twoParameterFigure.getB(), figure.getLength(), figure.getArea());

            }
        }

        for (Figure figure : figures) {
            if (Generator.generateFigure() instanceof RightTriangle) {
                RightTriangle rightTriangle = (RightTriangle) figure;
                System.out.printf("Гипотенуза треугольника [%s, %s] равна %s.%n", rightTriangle.getC(),rightTriangle.getB(), rightTriangle.getHypotenuse());
            }
        }

    }
}
