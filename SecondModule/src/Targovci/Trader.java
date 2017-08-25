package Targovci;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public abstract class Trader {
    private String name;
    private String address;
    private double capital;
    private ArrayList<Shop> shops;
    private ArrayList<Dealer> dealers;
    private Order order;

    public Trader(String name,double capital) {
        this.name = name;
        this.address = "Sofia";
        this.capital = capital;
        this.shops = new ArrayList<>();
        this.dealers = new ArrayList<>();
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ArrayList<Shop> getShops() {
        return this.shops;
    }

    public ArrayList<Dealer> getDealers() {
        return this.dealers;
    }

    public String getName() {
        return this.name;
    }

    abstract void addShop(ArrayList<Shop> shops);
    abstract void addDealer(ArrayList<Dealer> dealers);

    Dealer getRandomDealer(ArrayList<Dealer> dealers){
        return dealers.get(new Random().nextInt(this.dealers.size()));
    }

    public Shop getRandomShop(ArrayList<Shop> shops) {
        return shops.get(new Random().nextInt(this.shops.size()));
    }

    void makeOrder(){
        Dealer dealer=getRandomDealer(this.dealers);
        Order order=new Order(new Random().nextInt(9)+1);
        if(order.canBeOrdered(this)){
            System.out.println(this.name+" ordered an order.");
            this.payOrder(order, dealer);
        }
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    private void payOrder(Order order, Dealer dealer) {
        double price=order.calculatePrice();
        dealer.setMoney(dealer.getMoney()+price);
        System.out.println(this.name+" paid their order to "+dealer.getName());
        this.capital-=price;
        dealer.makeDiscount(order, this);
        this.getProductsToShop(this.getRandomShop(this.shops),order.getProducts());
        System.out.println(this.name+" sent their order to the shop.");
    }

    private void getProductsToShop(Shop randomShop, ArrayList<Product> products) {
        randomShop.setProducts(products);
        System.out.println("The products were added to the shop!");

    }

    void getProfitFromShop(){
        for (int i = 0; i < this.shops.size(); i++) {
            Shop shop=this.shops.get(i);
            this.setCapital(this.getCapital()+shop.getMoney());
            System.out.println(this.name+" got "+shop.getMoney()+" money from shop");
            shop.setMoney(0);
        }
    }

    void payTaxes(){
        int taxSum=0;
        for (int i = 0; i < this.shops.size(); i++) {
            taxSum+=this.shops.get(i).getTax();
        }

    }


    public double getCapital() {
        return this.capital;
    }
}
