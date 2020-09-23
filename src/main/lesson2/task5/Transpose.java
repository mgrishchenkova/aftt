package main.lesson2.task5;

import java.util.Random;

public class Transpose {
    public static void main(String[] args) {

        // часть 1 - создаем матрицу n на m
        int n = 3;
        int m = 4;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = new Random().nextInt(9);
            }
        }
//часть 2 - транспонирование
        int[][] aT = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aT[i][j] = a[i][j];
                }
                  }

                // часть 3- выводит на экран начальную матрицу
                System.out.println("Начальная матрица");
                System.out.println("------");
                for (int[] index: a) {
                    for (int[] index1: a) {
                        System.out.print(index1);
                    }
                }


                //часть 4 - выводит на экран транспонированную матрицу
                System.out.println();
                System.out.println("Новая матрица");
                System.out.println("------");
                for (int[] index2: aT) {
                    for (int[] index3:aT) {
                        System.out.print(index3);
                    }

                }

            }

        }
