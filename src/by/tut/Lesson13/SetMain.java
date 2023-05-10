package by.tut.Lesson13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new TreeSet<>();
        firstSet.add("afirst");
        secondSet.add("bfirst");
        firstSet.add("csecond");
        secondSet.add("asecond");
        firstSet.add("bthird");
        secondSet.add("cthird");
        firstSet.add("bthird");
        System.out.println(secondSet.add("cthird"));
        System.out.println(firstSet);
        System.out.println(secondSet);
        System.out.println(firstSet.contains("first"));
        System.out.println(firstSet.isEmpty());
        System.out.println(firstSet.size());
        System.out.println(firstSet.remove("csecond"));

        Set<Person> myPersonSet = new TreeSet<>();
        myPersonSet.add(new Person("Maks", "Trayanovich"));
        myPersonSet.add(new Person("Maks", "Tonk"));
        System.out.println(myPersonSet);

    }
}
