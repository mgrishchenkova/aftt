package main.lesson2.task2;

public class Chess {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                array[i][j] = (i + j) % 2;
        }

        System.out.println("Массив/For");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(array[i][j]);
            System.out.println();
        }

        System.out.println("Массив/ForEach");
        for (int[] array1 : array) {
            for (int element : array1)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Массив/While");
        int i = 0;
        int j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(array[i][j++]);
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
