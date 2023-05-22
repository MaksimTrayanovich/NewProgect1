package by.tut.Lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderExample {
    public static void main(String[] args) {
        List<Order> orders = getOrders();
        var result = orders
                .stream()
                .filter(isOrderWithEggs())
                .toList();

        System.out.println(result);

        var products = orders.stream()
                .flatMap(Order::getProductsStream)
                .distinct()
                .map(Product::getProductName)
                .toList();
        System.out.println(products);
    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order
                .getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product
                .getProductName()
                .equals("Eggs");
    }

    private static List<Order> getOrders() {
        List<Product> products = getProducts();

        List<Product> secondProducts = getSecondProducts();

        List<Product> thirdProducts = getThirdProducts();
        return Arrays.asList(new Order(1, products),
                new Order(2, secondProducts), new Order(3, thirdProducts));
    }

    private static List<Product> getThirdProducts() {
        return Arrays.asList
                (new Product("Milk", 20),
                        new Product("Milk", 20),
                        new Product("Milk", 20));
    }

    private static List<Product> getSecondProducts() {
        return Arrays.asList
                (new Product("Milk", 20),
                        new Product("Milk", 20),
                        new Product("Milk", 20));
    }

    private static List<Product> getProducts() {
        return Arrays.asList
                (new Product("Milk", 20),
                        new Product("Eggs", 15),
                        new Product("Sugar", 18));
    }
}
