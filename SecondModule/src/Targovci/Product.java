package Targovci;

import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class Product {
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
        this.price=new Random().nextDouble()*10+5;
    }

    public double getPrice() {
        return this.price;
    }
}
