package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class King extends ChessFigure {

    public King(Position position) {
        super("Король", position);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allChess = Chess.getChess();
        Set<Position> addKing = new HashSet<>();
        for (Position candidate: allChess)
        if (isMove(position,candidate))
            addKing.add(candidate);

        return addKing;
    }


    private boolean isMove(Position figurePosition, Position candidate) {
        int dx = Math.abs(figurePosition.getHorizontally() - candidate.getHorizontally());
        int dy = Math.abs(figurePosition.getVertically() - candidate.getVertically());
        if (dx == 0 && dy == 1) return true;
        if (dx == 1 && dy == 0) return true;
        if (dx == 1 && dy == 1) return true;
        return false;
    }
}
