package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Rook extends ChessFigure {

    public Rook(Position position) {
        super("Слон", position);
    }


    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allChess = Chess.getChess();
        Set<Position> allRook = new HashSet<>();
        for ( Position candidate: allChess)
            if( isMove(position,candidate))
                allRook.add(candidate);
        return allRook;
    }

    private boolean isMove(Position figurePosition, Position candidate) {
        int dx = Math.abs(figurePosition.getHorizontally() - candidate.getHorizontally());
        int dy = Math.abs(figurePosition.getVertically() - candidate.getVertically());
if ((dx==0 && dy==1)||
        (dx==0 && dy==2) ||
        (dx==0 && dy==3)||
        (dx==0 && dy==4)||
        (dx==0 && dy==5)||
        (dx==0 && dy==6)||
        (dx==0 && dy==7)) return true;
        if ((dx==1 && dy==0)||
                (dx==2 && dy==0) ||
                (dx==3 && dy==0)||
                (dx==4 && dy==0)||
                (dx==5 && dy==0)||
                (dx==6 && dy==0)||
                (dx==7 && dy==0)) return true;
        return false;
    }
}
