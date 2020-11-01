package main.lesson7.task3;

import main.lesson7.task3.Figures.*;
import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Player;
import main.lesson7.task3.chess.Position;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
      //figures.add(new King());



        Position position = new Position("E5");
      // ChessFigure king = new King(position);
    // ChessFigure knight = new Knight(position);
      //  ChessFigure rook = new Rook(position);
       // ChessFigure queen = new Queen(position);
        // ChessFigure bishop = new Bishop(position);
       // ChessFigure bishop = new Bishop(position);
       // ChessFigure pawn = new Pawn(Player.WHITE,position);
        ChessFigure pawn1 = new Pawn(Player.BLACK,position);
       // Set<Position> queenPos= queen.getAvailableMoves();
 //Set<Position> knightPos = knight.getAvailableMoves();
        //Set<Position> kingPos = king.getAvailableMoves();
       // Set<Position> bishopPos = bishop.getAvailableMoves();
        // Set<Position> pawnPos = pawn.getAvailableMoves();
        Set<Position> pawnPos1 = pawn1.getAvailableMoves();


    }

    private static void printMoves(ChessFigure figure){
        Set<Position> positions = figure.getAvailableMoves();
        StringBuffer sb = new StringBuffer() .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));


    }
}