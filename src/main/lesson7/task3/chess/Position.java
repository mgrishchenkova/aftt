package main.lesson7.task3.chess;

public class   Position {

    private char horizontally;
    private char vertically;

    public Position (String position){
        if (position.length()!=2)
            throw new IllegalArgumentException();
         horizontally=position.charAt(0);
                vertically=position.charAt(1);
               if (horizontally<'A' || horizontally>'H')
                   throw new IllegalArgumentException();
        if (vertically<'1' || vertically>'8')
            throw new IllegalArgumentException();


    }

    public Position(char horizontally, char vertically) {
        this.horizontally = horizontally;
        this.vertically = vertically;
    }
    public char getHorizontally() {
        return horizontally;
    }

    public char getVertically() {
        return vertically;
    }
    @Override
    public String toString() {
       return String.valueOf(horizontally)+vertically;
    }

    public String getPosition() {
        String h = String.valueOf(horizontally);
        return h + vertically;
    }
}
