package main.lesson2.task5;

import java.util.Random;

public class Transpose {
    public static void main(String[] args) {

        // часть 1 - создаем матрицу n на m
        int n = new Random().nextInt(3) + 3;
        int m = new Random().nextInt(3) + 3;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = new Random().nextInt(9);
            }
        }
//часть 2 - транспонирование
        //int[][] aT = new int[m][n];
     //   for (int i = 0; i < m; i++) {
     //       for (int j = 0; j < n; j++) {
      //          aT[i][j] = a[i][j];
        //    }
    //    }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
        }

    }





    }


