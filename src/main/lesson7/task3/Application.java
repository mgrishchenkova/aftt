package main.lesson7.task3;

import main.lesson7.task3.Figures.*;
import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.util.Set;

public class Application {
    public static void main(String[] args) {


        Position position = new Position("A1");
      // ChessFigure king = new King(position);
    // ChessFigure knight = new Knight(position);
        ChessFigure rook = new Rook(position);
        ChessFigure queen = new Queen(position);
        // ChessFigure bishop = new Bishop(position);
       // ChessFigure bishop = new Bishop(position);
        Set<Position> queenPos= queen.getAvailableMoves();
 //Set<Position> knightPos = knight.getAvailableMoves();
        //Set<Position> kingPos = king.getAvailableMoves();
       // Set<Position> bishopPos = bishop.getAvailableMoves();
        System.out.println();
    }
}