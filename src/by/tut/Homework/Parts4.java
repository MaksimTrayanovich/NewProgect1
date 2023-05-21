package by.tut.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Parts4 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Massive size:");
        for (int element : a) {
            System.out.println(" arr - "+a[i]);
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
