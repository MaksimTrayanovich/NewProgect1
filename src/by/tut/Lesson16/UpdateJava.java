package by.tut.Lesson16;

import java.util.HashMap;
import java.util.Map;

public class UpdateJava {
    public static void main(String[] args) {
        Map<String,String> testMap = new HashMap<>();
        testMap.getOrDefault("a","not found");
        testMap.putIfAbsent("a","abc");
    }
}
