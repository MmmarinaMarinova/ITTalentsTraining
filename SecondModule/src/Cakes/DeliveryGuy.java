package Cakes;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class DeliveryGuy {
    private String name;
    private String phone;
    private HashSet<Order> orders;
    private double tips;
    private CakeShop cakeShop;

    public DeliveryGuy(String name, String phone,CakeShop cakeShop) {
        this.name = name;
        this.phone = phone;
        this.tips = 0.0;
        this.orders=new HashSet<>();
        this.cakeShop=cakeShop;
    }

    public void addOrder(Order order) {
        this.orders.add(order);

    }

    public void deliverOrder(Order order) {
        System.out.println("Hi, I am "+this.name);
        System.out.println("The price of the order is"+order.getPrice());
        order.getClient().payOrder(order);
    }
}
