package by.tut.Lesson9;

public class Dentist implements Doctor {
    @Override
    public void heal() {
        System.out.println("How many teath do you have ? Lets reduce the number");
    }
}
