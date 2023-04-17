package by.tut.Homework.Lesson7.Part2;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        Director director = new Director();
        director.human();
        accountant.human();
        worker.human();
    }
}
