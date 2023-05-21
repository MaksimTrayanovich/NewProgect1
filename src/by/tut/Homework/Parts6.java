package by.tut.Homework;

import java.util.Arrays;
import java.util.Random;

public class Parts6 {
    public static void main(String[] args) {
        float[] arr = new float[5];
        for (int a = 0; a < arr.length; a++) {
            Random random = new Random();
            arr[a] = random.nextInt(5);
            for (int i = 0; i < arr.length; i++) {
                float avg = 0;
                avg += arr[i] / arr.length;
                System.out.println("arr[" + a + "]=" + arr[a]);
                System.out.println("avg[" + a + "]=" + avg);
                float[] arr2 = new float[5];
                for (int b = 0; b < arr2.length; b++) {
                    for (int d = 0; d < arr.length; d++) {
                        float avg2 = 0;
                        avg2 += arr[d] / arr.length;
                        arr2[b] = random.nextInt(5);

                        System.out.println("arr2[" + b + "]=" + arr2[b]);
                        System.out.println("avg2[" + b + "]=" + avg2);

                        if (avg == avg2) ;
                        System.out.println("Average the same");
                        if (avg > avg2) ;
                        System.out.println("Arr>Arr2");
                        if (avg < avg2) ;
                        System.out.println("Arr<Arr2");
                    }

                }
            }
        }
    }
}
