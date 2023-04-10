package by.tut.Lesson7;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void flyWithsound() {
        System.out.println("Airplane is flying,hzhzhzzhzzhczvz");
    }
}
