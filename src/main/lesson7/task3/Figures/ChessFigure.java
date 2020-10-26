package main.lesson7.task3.Figures;

import main.lesson7.task3.chess.Player;
import main.lesson7.task3.chess.Position;

import java.util.HashSet;
import java.util.Set;

public abstract class ChessFigure {
    public Player player;
    public Position position;
    public String name;

    public ChessFigure(Player player, Position position, String name) {
        this.player = player;
        this.position =position;
        this.name = name;
    }

    public ChessFigure(String name, Position position) {
        this.position = position;
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public Player getPlayer(){
        return player;
    }
public ChessFigure(Player player,Position position){
        this.player=player;
        this.position=position;
}
    public abstract Set<Position> getAvailableMoves();



}



