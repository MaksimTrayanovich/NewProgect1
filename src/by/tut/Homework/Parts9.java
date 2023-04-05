package by.tut.Homework;

import java.util.Arrays;
import java.util.Random;

public class Parts9 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int res = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(5);
                res += arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(res);
    }
}