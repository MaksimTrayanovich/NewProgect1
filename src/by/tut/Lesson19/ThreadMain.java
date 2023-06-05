package by.tut.Lesson19;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: "+ name);
        Thread.currentThread().setName("My super name");
        System.out.println("Thread name: "+ Thread.currentThread().getName());
        System.out.println("is alive" + Thread.currentThread().isAlive());
        System.out.println("is interrupted: "+ Thread.currentThread().isInterrupted());
        try {

            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        System.out.println("Hello world2");
    }
}
