package by.tut.Lesson13;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        String[] arr = {"First,Second,Third"};
        List<String> arrList = Arrays.asList(arr);
        List<String> nextArr = new ArrayList<>();
        nextArr.addAll(arrList);

        Map<String, List<String>> products = new HashMap<>();
        List<String> fruits = new ArrayList<>();
        String category = "fruits";
        products.put(category, new ArrayList<>());

        if (category.equals("fruits")) {
            fruits.add("Apple");
        }

    }

    public static void fillMapByCategory(Map<String, List<String>> products, String category) {
        List<String> categoryProducts = products.get(category);
        if (categoryProducts == null) {
            System.out.println("no category");
        } else {
            categoryProducts.add("Apple");
        }
    }
}