package by.tut.Lesson19;

import java.time.LocalDateTime;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalDateTime.now());
        MyThread thread1 = new MyThread("First");
        MyThread thread2 = new MyThread("Second");
        MyThread thread3 = new MyThread("Third");
        thread3.setDaemon(true);
        thread1.start();
        System.out.println(thread1.isAlive());
        thread2.start();
        thread2.join();
        thread3.start();
       // thread3.interrupt();
//        new Thread(() -> {
//            while (true){
//                System.out.println("Hello world spam");
//            }
//        }).start();
        System.out.println("End: " + LocalDateTime.now());
        System.out.println(thread1.getCount());
    }
}
