package by.tut.Lesson16;

import java.util.List;
import java.util.stream.Stream;

public class Order {
    private int id;
    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }
public Stream<Product> getProductsStream(){
        return products.stream();
}
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
