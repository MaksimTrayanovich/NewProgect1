package by.tut.Homework;

import java.util.Random;

public class Parts5 {
    public static void main(String[] args) {
        int n = 10;
        float[] arr = new float[n];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10);
        }
        float max = arr[0];
        float min = arr[0];
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            avg += arr[i] / arr.length;
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("avg=" + avg);
    }
}