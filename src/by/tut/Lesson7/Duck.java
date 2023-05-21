package by.tut.Lesson7;

public class Duck implements Flyable{

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void flyWithsound() {
        System.out.println("Duck is flying,krya kraya");
    }

    @Override
    public void printMessage() {
        System.out.println("Duck message");
    }
}
