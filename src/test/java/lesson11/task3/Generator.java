package lesson11.task3;

import java.util.Random;

public class Generator {
    public int randomInteger(int start, int end){
    return new Random().nextInt(end)+start;
    }
    public String randomString(int startLength, int endLength){
        String AlphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder();
        for ( int i=startLength;i<=endLength;i++){
            sb.append(AlphaString);
        }
        return sb.toString();
    }
}
