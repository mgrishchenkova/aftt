package main.lesson2.tak6;

import java.util.Random;

public class Matrix {

    public static void main(String[] args){
       int n=new Random().nextInt(3)+3;
        int m=new Random().nextInt(3)+3;
       int[][] array = new int[n][m];

    //задание массива и вывод его на экран
        System.out.print("Вывод исходной матрицы");
       for (int i=0;i<n;i++){
           System.out.println();
           for (int j=0;j<m;j++){
               array[i][j]=new Random().nextInt(2);
               System.out.print(array[i][j]);
           }

       }

       //выбор случайного числа из массива
         int x = 1 + new Random().nextInt(m - 2);
         int y = 1 + new Random().nextInt(n - 2);
        array[x][y] = 2;

        // Переменная для инвертирования. Как только дойдем до элемента 2, поменяем на значение 1.
        int inverse = 0;

        int[][] newArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 2) {
                    newArray[i][j] = 2;
                    inverse = 1;
                    continue;
                }
                newArray[i][j] = (array[i][j] + inverse) % 2;
            }
        }
        // вывод переделанной матрицы
        System.out.println();
        System.out.println("Вывод инвертированнй матрицы");
        for (int i=0;i<n;i++){
            System.out.println();
            for (int j=0;j<m;j++){

                System.out.print(newArray[i][j]);
            }

        }
    }
}
