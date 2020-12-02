package lesson11.task3;

import java.util.Random;

public class Generator {
    public static int randomInteger(int start, int end){
        return new Random().nextInt(end)+start;
    }
    public static String randomString(int startLength, int endLength){
        String pattern="ABCDabcd";
        StringBuilder sb= new StringBuilder();
        int length= new Random().nextInt(endLength)+startLength;
        for (int i=0;i<=length;i++){
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
