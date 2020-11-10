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
        Position position = new Position("A1");
        Position position1 = new Position("B2");
        Position position2 = new Position("C3");
        Position position3 = new Position("E4");
        Position position4 = new Position("D5");
        Position position5 = new Position("C6");
      figures.add(new King(position));
        figures.add(new Bishop(position1));
        figures.add(new Knight(position3));
        figures.add(new Pawn(Player.BLACK,position2));
        figures.add(new Rook(position4));
        figures.add(new Queen(position5));

        for (ChessFigure figure : figures)
            printMoves(figure);



      // ChessFigure king = new King(position);
    // ChessFigure knight = new Knight(position);
      //  ChessFigure rook = new Rook(position);
       // ChessFigure queen = new Queen(position);
        // ChessFigure bishop = new Bishop(position);
       // ChessFigure bishop = new Bishop(position);
       // ChessFigure pawn = new Pawn(Player.WHITE,position);
        //ChessFigure pawn1 = new Pawn(Player.BLACK,position);
       // Set<Position> queenPos= queen.getAvailableMoves();
 //Set<Position> knightPos = knight.getAvailableMoves();
        //Set<Position> kingPos = king.getAvailableMoves();
       // Set<Position> bishopPos = bishop.getAvailableMoves();
        // Set<Position> pawnPos = pawn.getAvailableMoves();
      //  Set<Position> pawnPos1 = pawn1.getAvailableMoves();


    }

    private static void printMoves(ChessFigure figure){
        Set<Position> positions = figure.getAvailableMoves();
       StringBuffer sb = new StringBuffer() .append(figure.name).append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(position.getPosition()).append(", ");
        }
        System.out.println(sb.toString());


    }
}