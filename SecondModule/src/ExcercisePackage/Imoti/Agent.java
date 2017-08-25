package ExcercisePackage.Imoti;

import java.util.ArrayList;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Agent {
    private String name;
    private String phone;
    private double money;
    private ArrayList<Seller> sellers;
    private ArrayList<Buyer> buyers;
    private ArrayList<Review> reviews;

    public Agent(String name) {
        this.name=name;
        this.phone="+3594512789";
        this.money=0.0;
        this.sellers=new ArrayList<>();
        this.buyers=new ArrayList<>();
        this.reviews=new ArrayList<>();
    }


     void addSeller(Seller seller) {
        if(seller!=null){
            this.sellers.add(seller);
        }
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    void addBuyer(Buyer buyer) {
        if(buyer!=null){
            this.buyers.add(buyer);
            System.out.println(buyer.getName()+" added to agent "+this.name);
        }
    }

    void printInfo(){
        System.out.println(this.name+" has "+this.money);
    }
}
