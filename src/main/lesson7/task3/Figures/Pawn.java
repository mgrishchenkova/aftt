package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Chess;
import main.lesson7.task3.chess.Player;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends ChessFigure {

    public Pawn(Player player, Position position) {
       super(player, position,"Пешка");
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allChess = Chess.getChess();
        Set<Position> allPawn = new HashSet<>();
        for (Position candidate : allChess) {
            if (player == Player.WHITE && isMoveWhite(position, candidate))
                allPawn.add(candidate);
            if (player == Player.BLACK && isMoveBlack(position, candidate))
                allPawn.add(candidate);

        }
        return allPawn;
    }

    private boolean isMoveWhite( Position figurePos, Position candidate) {
        int dx = Math.abs(figurePos.getHorizontally() - candidate.getHorizontally());
        int dy = figurePos.getVertically() - candidate.getVertically();
        if (figurePos.getVertically() ==2
                && (dx == 0 && dy == -2))
            return true;
        if (figurePos.getVertically() ==2
                && (dx == 0 && dy == -1))
            return true;
        if (figurePos.getVertically()!=2
                && (dx == 0 && dy == -1))
            return true;
        return false;
    }

        private boolean isMoveBlack( Position figurePos, Position candidate) {
            int dx = Math.abs(figurePos.getHorizontally() - candidate.getHorizontally());
            int dy = figurePos.getVertically() - candidate.getVertically();
        if (figurePos.getVertically() == 7
                && (dx == 0 && dy == 2 || dx == 0 && dy == -1))
            return true;
        if (figurePos.getVertically() != 7
                && ( dx == 0 && dy == -1))
            return true;
        return false;
    }
}
