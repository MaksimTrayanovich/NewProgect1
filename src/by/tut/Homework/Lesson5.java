package by.tut.Homework;

import java.util.Arrays;
import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(result));
    }
}
