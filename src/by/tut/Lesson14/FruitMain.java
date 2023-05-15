package by.tut.Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 20, "Yellow"));
        fruits.add(new Fruit("Apple", 10, "Red"));
        fruits.add(new Fruit("Plume", 10, "Blue"));
        fruits.add(new Fruit("Peach", 25, "Yellow"));
        fruits.add(new Fruit("Dragon fruit", 40, "Red"));
        System.out.println(filterFruitsColor(fruits));
        System.out.println(filterFruitsWeight(fruits));
        System.out.println(filterFruitsName(fruits));
        Predicate<Fruit> colorPredicate = fruit -> fruit.getColor().equals("Red");
        Predicate<Fruit> weighPredicate = fruit -> fruit.getWeight() > 10;
        Predicate<Fruit> namePredicate = fruit -> fruit.getName().length() > 5;
        //предикат что то даем возвращает true or false
        //сонсьюмер что то даем ничего не возвращает
        Consumer<Fruit> myStringConsumer = s -> System.out.println(s);
        printNeededFruits(fruits, myStringConsumer);
        Consumer<Fruit> bananaConsumer = fruit -> {
            if (fruit.getName().equals("Banana")) {
                System.out.println("we print only bananas");
                System.out.println(fruit);
            }
        };
        Consumer<Fruit> bigFruitConsumer = fruit -> {
            if (fruit.getWeight() > 20) {
                System.out.println("we print only big");
                System.out.println(fruit);
            }
        };
        printNeededFruits(fruits, bananaConsumer);
        printNeededFruits(fruits,bigFruitConsumer);
        System.out.println(filterFruits(fruits, colorPredicate));
        System.out.println(filterFruits(fruits, weighPredicate));
        System.out.println(filterFruits(fruits, namePredicate));
        System.out.println(filterFruits(fruits, fruit -> fruit.getWeight() > 20 && fruit.getColor().equals("Red")));
    }

    private static void printNeededFruits(List<Fruit> fruits, Consumer<Fruit> fruitConsumer) {
        for (Fruit fruit : fruits) {
            fruitConsumer.accept(fruit);
        }
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> predicate) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (predicate.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruitsColor(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals("Red")) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruitsWeight(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getWeight() > 15) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static List<Fruit> filterFruitsName(List<Fruit> fruits) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().length() > 5) {
                result.add(fruit);
            }
        }
        return result;
    }
}
