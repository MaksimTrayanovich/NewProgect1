package by.tut.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Parts7 {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number-");
        int myParam = scanner.nextInt();
        int[][][] superArr = new int[3][3][3];
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                for (int k = 0; k < superArr[i][j].length; k++) {
                    superArr[i][j][k] = myParam + superArr[i][j][k];
                    System.out.println(" superArr[" + i + "][" + j + "][" + k + "]=" + superArr[i][j][k]);
                }
            }
        }
        System.out.println(Arrays.deepToString(superArr));
    }
}