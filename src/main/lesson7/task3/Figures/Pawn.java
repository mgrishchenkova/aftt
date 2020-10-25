package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Player;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessFigure{

    public Pawn(Player player,Position position){
        super(player,position,"Пешка");
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allChess = Chess.getChess();
        Set<Position> allPawn= new HashSet<>();
        for ( Position candidate: allChess)
            if( isMove(player,position,candidate))
                allPawn.add(candidate);
        return allPawn;
    }

    private boolean isMove (Player player, Position figurePos, Position candidate){
        int dx=figurePos.getHorizontally()-candidate.getHorizontally();
        int dy=figurePos.getVertically()-candidate.getVertically();
        if (player==Player.WHITE && (dx==0 && dy==1)) return true;
        if (player==Player.BLACK && (dx==0 && dy==-1)) return true;
        return false;
    }
}
