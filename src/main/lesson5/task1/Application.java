package main.lesson5.task1;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        int n = new Random().nextInt(5) + 5;
        int m = new Random().nextInt(5) + 5;
        int[] dividends = new int[m];
        int[] dividers = new int[n];

        System.out.println("Массив dividends");
    for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(5) + 4;
            System.out.print(dividends[i]);
        }


        System.out.println("");
        System.out.println("Массив dividers");

        for (int i= 0; i < n; i++) {
            dividers[i] = new Random().nextInt(4);
            System.out.print(dividers[i]);
        }


        int[][] result = new int[n][m];

        System.out.println("");
        System.out.println("Массив result");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];
                } catch (ArithmeticException exception) {
                    result[j][i] = -1;
                }
                System.out.print(result[i][j]);
            }
        }

    }
}
