package by.tut.Lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Apple", 10, "Red"));
        fruits.add(new Fruit("Plume", 10, "Blue"));
        fruits.add(new Fruit("Peach", 25, "Yellow"));
        fruits.add(new Fruit("Dragon fruit", 40, "Red"));
        //Collections.sort(Fruit);
        Collections.sort(fruits, (o1, o2) -> o1.getName().length() - o2.getName().length());
        Collections.sort(fruits, (o1, o2) -> o1.getWeight() - o2.getWeight());
        System.out.println(fruits);
        Supplier<Integer> myRundomSupplier = () -> new Random().nextInt(5);
        System.out.println(getOneFruit(fruits, myRundomSupplier));
        System.out.println(getOneFruit(fruits, myRundomSupplier));

        Supplier<Integer> myNotBanannaSupplier = () -> {
            int position = new Random().nextInt(5);
            while (fruits.get(position).getName().equals("Banana")) {
                position = new Random().nextInt(5);
            }
            ;
            return position;
        };
        System.out.println(getOneFruit(fruits, myNotBanannaSupplier));

        Function<Fruit, String> getNameFunction = fruit -> fruit.getName();
        Function<Fruit, String> getShortNameFunction = fruit -> fruit.getName().substring(0, 2);
        Function<Fruit, String> getSizeFunction = fruit -> fruit.getWeight() < 10 ? "Small" : "Big";
    }

    private static List<String> convertFrits(List<Fruit> fruits, Function<Fruit, String> converter) {
        List<String> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            result.add(converter.apply(fruit));
        }
        return result;
    }

    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> positionSupplier) {
        return fruits.get(positionSupplier.get());
    }
}
