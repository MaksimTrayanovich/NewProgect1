package by.tut.Lesson19;

public class MyRunnable implements Runnable{
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0; i<10000; i++){
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("run from runnable!!");
    }
}
