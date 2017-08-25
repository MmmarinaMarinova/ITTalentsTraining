package Targovci;

import java.util.ArrayList;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class Order {
    private ArrayList<Product> products;
    private int countOfProducts;

    public Order(ArrayList<Product> products, int countOfProducts) {
        this.products = products;
        this.countOfProducts=countOfProducts;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public Order(int countOfProducts) {
        this.products=new ArrayList<>();
        this.countOfProducts=countOfProducts;
    }

    void generateProducts(){
        for (int i = 0; i < countOfProducts; i++) {
            Product product=new Product("Product "+(i+1));
            this.products.add(product);
        }
    }

    public boolean canBeOrdered(Trader trader) {
        return this.calculatePrice()<trader.getCapital()*0.5;
    }

     double calculatePrice() {
        double price=0;
        for (int i = 0; i < this.products.size(); i++) {
            price+=this.products.get(i).getPrice();
        }
        return price;
    }
}
