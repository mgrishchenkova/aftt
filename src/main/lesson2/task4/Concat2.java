package main.lesson2.task4;

import main.lesson2.task1.ConcatString;

import java.util.Arrays;

public class Concat2 {
    public static void main(String[] args) {
        String stroka1 = "Masha";
        String stroka2 = "Anton";

        char[] symbol1 = stroka1.toCharArray();
        Arrays.sort(symbol1);


        String result = "";
        for (char ch : symbol1) {
            String symbol = String.valueOf(ch);
            if (result.contains(symbol))
                continue;  // Переходим к следующему символу, если он уже есть в итоговой строке
            if (stroka2.contains(symbol)) result += symbol;
        }
        System.out.println(result);
    }



}

