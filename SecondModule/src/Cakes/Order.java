package Cakes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class Order {
    private Client client;
    private double price;
    private String address;
    private ArrayList<Cake> cakes;
    private LocalDate date;

    public Order(Client client,String address, ArrayList<Cake> cakes) {
        this.client = client;
        this.address = address;
        this.date = LocalDate.now();
        this.cakes=cakes;
        calculatePrice();
    }

    private void calculatePrice() {
        for (Cake cake:this.cakes) {
            this.price+=cake.getPrice();
        }

        System.out.println("Price of the order: "+this.price);
        double discountAmount=0;
        if(client.isCorporate()){
            discountAmount=this.price*((CorporateClient)client).getDiscount()/100;
            this.price-=discountAmount;
        }else{
            discountAmount=this.price*((PrivateClient)client).calculateDiscount();
            this.price-=discountAmount;
        }
        System.out.println("Price of the order with discount: "+this.price);

    }

    public double getPrice() {
        return this.price;
    }

    public Client getClient() {
        return this.client;
    }

    private void addCake(Cake cake){
        //todo
        calculatePrice();
    }
}
