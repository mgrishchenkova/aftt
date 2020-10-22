package main.lesson7.task3;

import main.lesson7.task3.Figures.ChessFigure;
import main.lesson7.task3.Figures.King;
import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Position position = new Position("C1");
        ChessFigure king = new King(position);
        Set<Position> kingPos = king.getAvailableMoves();
        System.out.println();
    }
}