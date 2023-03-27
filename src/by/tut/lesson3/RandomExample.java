package by.tut.lesson3;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(5));
//        }
        for (int i = 0; i < 100; i++) {
            System.out.println("" + i);
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
