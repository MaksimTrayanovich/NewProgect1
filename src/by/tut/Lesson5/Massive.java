package by.tut.Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] newArr = new int[10];

        System.out.println(Arrays.compare(arr, newArr));
        System.out.println(Arrays.equals(arr, newArr));
        int[][] arr2 = new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" arr[i][j]=" + arr2[i][j]);
            }
            System.out.println();
        }
        int[][] arr3 = new int[4][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            Arrays.fill(arr3[i], i + 1);
        }
        System.out.println(Arrays.deepToString(arr3));
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                Random random = new Random();
                arr4[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.deepToString(arr4));
        }
        int[][][] superArr = new int[11][11][11];
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                for (int k = 0; k < superArr[i][j].length; k++) {
                    System.out.print(" superArr["+ i +"]["+ j +"]["+ k +"]=" + superArr[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}