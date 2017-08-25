package Warehouse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Marina on 25.8.2017 г..
 */
public class Shop extends Market{
    private ArrayList<Product> productsInShop;
    private int money;

    public Shop(String name, int money) {
        super(name);
        this.money = money;
        this.productsInShop=openMarket();
    }

    private void addProduct(Product product){
        this.productsInShop.add(product);
        System.out.println("Added "+product.getName()+" to "+this.getName());
    }


    public void increaseProductAvailability(String productName, int desiredCount) {
        for (Product product:this.productsInShop) {
            if(product.getName().equals(productName)){
                product.increaseAvailability(desiredCount);
                System.out.println(desiredCount+" "+ productName+" have been added to "+this.getName());
            }
        }
    }

     Collection<Product> getProductsInShop() {
        return Collections.unmodifiableCollection(this.productsInShop);
    }

    public Product getRandomProduct() {
        return this.productsInShop.get(new Random().nextInt(this.productsInShop.size()));
    }

    public Product sellToClient(Product product, int quantity) {
        product.decreaseAvailability(quantity);
        return generateProduct(product,quantity);
    }

    private Product generateProduct(Product product, int quantity) {
        if(product.isFruit()){
            return new Fruit(product.getName(),product.getPrice(),quantity);
        }
        if(product.isMeat()){
            return new Meat(product.getName(),product.getPrice(),quantity);
        }else {
            return new Vegetable(product.getName(),product.getPrice(),quantity);
        }
    }

    public void getProfit(int price) {
        this.money+=price;
    }

    void printInfo(){
        System.out.println("*********Shop*********");
        System.out.println("Name: "+this.getName());
        for (Product product :this.productsInShop) {
            product.printInfo();
        }
        System.out.println("**********************");
    }
}
