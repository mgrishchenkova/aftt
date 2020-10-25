package main.lesson7.task3;

import main.lesson7.task3.Figures.ChessFigure;
import main.lesson7.task3.Figures.King;
import main.lesson7.task3.Figures.Knight;
import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.util.Set;

public class Application {
    public static void main(String[] args) {


        Position position = new Position("A1");
      // ChessFigure king = new King(position);
     ChessFigure knight = new Knight(position);
 Set<Position> knightPos = knight.getAvailableMoves();
        //Set<Position> kingPos = king.getAvailableMoves();
        System.out.println();
    }
}