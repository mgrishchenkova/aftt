package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.io.PipedOutputStream;
import java.util.HashSet;
import java.util.Set;

public class Knight extends ChessFigure{

    public Knight(Position position) {
        super("Конь", position);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allChess = Chess.getChess();
        Set<Position> addKnight = new HashSet<>();
        for (Position candidate: allChess)
            if (isMove(position,candidate))
                addKnight.add(candidate);

        return addKnight;

    }

    private boolean isMove(Position figurePosition, Position candidate){
        int dx=Math.abs(figurePosition.getHorizontally()-candidate.getHorizontally());
        int dy=Math.abs(figurePosition.getVertically()-candidate.getVertically());
      if (dx==2 && dy==1) return true;
     if (dx==1 && dy==2) return true;
        return false;
    }
}
