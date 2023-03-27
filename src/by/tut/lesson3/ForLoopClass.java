package by.tut.lesson3;

import java.util.Random;

public class ForLoopClass {
    public static void main(String[] args) {
//        for (int counter = 0; counter < 100; counter++) {
//            System.out.println("" + counter);
        {
//            for (int x = 0; x < 100; x++) {
//                if (x % 2 == 0) {
//                    System.out.println(x);
//                }
//
//                int count = 100;
//                while (count > 0) {
//                    System.out.println("count:" + count--);
//                }
//                do {
//                    System.out.println("count again:" + count++);
//                }
//                while (count < 100);
//            }
            int res = 0;
            while (res > 0) {
                System.out.println("res:" + res++);
            }
            do {
                System.out.println("res" + res++);
                res += 1;
            } while (res < 100);
        }
        int count = 100;
        while (count > 0) {
            System.out.println("count:" + count);
            count -= 2;
            if (count % 25 == 0) {
                break;
            }

        }
    }
}
