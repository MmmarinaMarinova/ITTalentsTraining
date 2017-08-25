package Warehouse;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 25.8.2017 г..
 */
public class Client {
    private String name;
    private int money;
    private ArrayList<Product> shoppingCart;

    public Client(String name, int money) {
        this.name = name;
        this.money = money;
        this.shoppingCart=new ArrayList<Product>();
    }

    void buyRandomProduct(Shop shop){
        int quantity=new Random().nextInt(4)+1;
        Product product=shop.getRandomProduct();
        int price=product.calculatePrice(quantity);
        if(price<=this.money){
            this.shoppingCart.add(shop.sellToClient(product,quantity));
            System.out.println(this.name+" just added "+quantity+" "+product.getName()+" to shopping cart");
            this.payToShop(shop,price);
        }
    }

    private void payToShop(Shop shop,int price) {
        this.money-=price;
        shop.getProfit(price);
        System.out.println(this.name+" just bought products for "+price+" from "+shop.getName());
    }


    public void printInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Money: "+this.money);
    }
}
