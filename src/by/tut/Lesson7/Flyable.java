package by.tut.Lesson7;

public interface Flyable {
    void fly();

    void flyWithsound();

    default void printMessage() {
        System.out.println("this is non informative message");
    }
}
