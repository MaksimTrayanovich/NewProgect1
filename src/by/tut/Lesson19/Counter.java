package by.tut.Lesson19;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private volatile int counter;
    private final Object lock = new Object();
    private AtomicInteger intCount;
    private int count;

    public Counter() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //    public synchronized void increment() throws InterruptedException {
//        setCount(getCount() + 1);
//        System.out.println("egegei");
//        Thread.sleep(1000);
//    }
    public synchronized void increment() throws InterruptedException {

        synchronized (lock) {
            setCount(getCount() + 1);
        }
//        intCount.incrementAndGet();
//        intCount.decrementAndGet();
//        System.out.println("egegei");
//        Thread.sleep(10);
    }
}

