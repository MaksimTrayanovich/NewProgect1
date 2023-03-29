package by.tut.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassworkLesson4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int[] arr2 = new int[5];
        System.out.println("third element :" + arr[2]);
        System.out.println("third element :" + arr2[2]);
        arr2[2] = 10;
        System.out.println("third element :" + arr2[2]);
        System.out.println("Arr length :" + arr.length);
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
            System.out.println("arr2[" + i + "]=" + arr2[i]);
        }
        int[] arr3 = new int[10];
        System.out.println("element :" + arr3[1]);
        System.out.println("Arr length :" + arr.length);

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
//            System.out.println("arr3[" + i + "]=" + arr3[i]);
            System.out.println(Arrays.toString(arr3));
            for (int val : arr2) {
//                System.out.println(val);
                int sum = 0;
                {
                    sum += val;
                }
                System.out.println(sum);
            }
            Arrays.sort(arr2, 2, 5);
            System.out.println(Arrays.toString(arr2));
            int result = -1;
            int[] arr4 = new int[10];
            for (int a = 0; a < arr4.length; a++) {
                arr4[a] = random.nextInt(10);
                System.out.println("arr4[" + a + "]=" + arr4[a]);
//                if (result < arr4[a]) {
////                    System.out.println(arr4[a]);
                int countOfTwo = 0;
                for (int vall : arr4) {
                    if (vall == 2) {
                        countOfTwo += 1;

                    }
                }
                System.out.println(countOfTwo);
            }

        }
    }
}
