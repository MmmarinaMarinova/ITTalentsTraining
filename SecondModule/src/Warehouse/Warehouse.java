package Warehouse;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 25.8.2017 г..
 */
public class Warehouse extends Market {
    private ArrayList<Product> availableProducts;


    public Warehouse(String name) {
        super(name);
        this.availableProducts=openMarket();
    }

    void getDelivery(int deficiencyNumber, int increase){
        System.out.println("----------------");
        System.out.println("Checking if "+this.getName()+" has enough of this product");
        for (Product product :this.availableProducts) {
            if(!product.isAvailable(deficiencyNumber)){
                product.increaseAvailability(increase);
            }
        }
    }

    void orderProducts(String productName,int desiredCount, Shop shop){
        for (Product product:this.availableProducts) {
            if(product.getName().equals(productName)){
                if(!product.isAvailable(desiredCount)){
                    System.out.println(this.getName()+" doesn't have enough available of that product.Please wait a bit!");
                    product.increaseAvailability(desiredCount);
                }else{
                    System.out.println(this.getName()+" has enough quantity of this product!");
                }
                sellProduct(product,desiredCount,shop);
            }
        }
    }

    private void sellProduct(Product product, int desiredCount, Shop shop) {
        product.decreaseAvailability(desiredCount);
        shop.increaseProductAvailability(product.getName(),desiredCount);
    }

    void printInfo(){
        System.out.println("*********Warehouse*********");
        System.out.println("Name: "+this.getName());
        for (Product product :this.availableProducts) {
            product.printInfo();
        }
        System.out.println("***************************");
    }
}
