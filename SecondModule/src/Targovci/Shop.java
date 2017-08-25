package Targovci;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public abstract class Shop {
    private String address;
    private String openingTimes;
    private int squareMeters;
    private int tax;
    private double money;
    private ArrayList<Product> products;

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
        setProducts(this.products);
    }

    public Shop(int tax, int squareMeters) {
        this.address="Sofia";
        this.openingTimes="8:00 - 20:00";
        this.squareMeters=squareMeters;
        this.money=0;
        this.tax = tax;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void sellProducts(){
        Random random=new Random();
        int countOfSoldProducts=random.nextInt(this.products.size());
        double profit=0;
        for (int i = 0; i < countOfSoldProducts; i++) {
            Product product=this.getRandomProduct();
            profit+=product.getPrice()*1.3;
            this.products.remove(product);
        }
        this.money+=profit;
    }

    private Product getRandomProduct() {
        return this.products.get(new Random().nextInt(this.products.size()));
    }


    public abstract boolean isStall(Shop shop);

    public abstract boolean isKiosk(Shop shop);

    public abstract boolean isMallShop(Shop shop);

    public int getTax() {
        return tax;
    }

    public void showInfo() {
        System.out.println("This shop has "+this.money+"\n");
    }
}
