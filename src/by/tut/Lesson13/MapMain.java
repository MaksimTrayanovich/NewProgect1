package by.tut.Lesson13;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> firstMap = new HashMap<>();
        Map<Integer, String> secondMap = new TreeMap<>();
        firstMap.put("first", "Red");
        firstMap.put("second", "Orange");
        firstMap.put("third", "Yellow");
        firstMap.put("first", "next");
        System.out.println(firstMap.get("first"));
        System.out.println(firstMap.get("forth"));
        secondMap.put(1, "Red");
        secondMap.put(2, "Orange");
        secondMap.put(3, "Yellow");
        System.out.println(firstMap.containsKey("third"));
        System.out.println(firstMap.isEmpty());
        System.out.println(firstMap.size());
//        System.out.println(firstMap.remove(3));
        System.out.println(firstMap.keySet());
        System.out.println(firstMap.values());
        System.out.println(firstMap);
        for (String key : firstMap.keySet()) {
            System.out.println(firstMap.get(key));
        }
        firstMap.forEach((k, v) -> System.out.println(k + " " + v));

        List<Integer> integers;
        List<List<Integer>> integers2;
        Map<String,List<String>> myMap = new HashMap<>();
        //computers(lenovo,asu)
        //phones(samsung,iphone)

        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");

        List<String> phones = new ArrayList<>();
        phones.add("Samsung");

        myMap.put("computers",computers);
        myMap.put("phones",phones);
    }
}
