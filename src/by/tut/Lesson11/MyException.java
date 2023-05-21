package by.tut.Lesson11;

public class MyException extends Exception {
    private int age;

    public int getAge() {
        return age;
    }

    public MyException(String message, int age) {
        super(message);
        this.age = age;

    }
}
