package main.lesson2.task5;

import java.util.Random;

public class Transpose {
    public static void main(String[] args) {

        // часть 1 - создаем матрицу n на m
        int n = new Random().nextInt(3) + 3;
        int m = new Random().nextInt(3) + 3;
        int[][] array1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array1[i][j] = new Random().nextInt(9);
            }
        }
//часть 2 - транспонирование
        int[][] arrayTranspose = new int[m][n];
      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              arrayTranspose[i][j] = array1[j][i];
           }

       }
//вывод первоначальной матрицы
       System.out.println("Первоначальная матрица");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array1[i][j]);
            }
        }
        System.out.println();
     System.out.println("транспонирования матрица");
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arrayTranspose[i][j]);
            }
        }

    }





    }


