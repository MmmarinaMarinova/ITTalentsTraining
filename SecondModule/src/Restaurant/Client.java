package Restaurant;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public abstract class Client {
    private String name;
    private double money;
    protected Waiter waiter;
    protected ArrayList<MenuProduct> order;
    private Restaurant restaurant;


    public Client(String name, double money, Restaurant restaurant) {
        this.name = name;
        this.money = money;
        this.restaurant = restaurant;
    }

    abstract void order(Restaurant restaurant);

    double askForCheck(){
        return this.waiter.makeCheck(this.order);
    }

    public void payCheck(){
        double priceOfCheck=askForCheck();
        Random random=new Random();
        double tip=0;
        int chanceToLeaveTip=random.nextInt(100);
        if(chanceToLeaveTip>80){
            int tipPercent=random.nextInt(5)+5;
            tip=priceOfCheck*tipPercent/100;
            this.waiter.setTips(this.waiter.getTips()+tip);
        }
        this.restaurant.setMoney(this.restaurant.getMoney()+priceOfCheck);
        System.out.println(this.name+" tipped the waiter with: "+tip);
        System.out.println(this.name+" paid the check.");
    }

    boolean canOrder(ArrayList<MenuProduct> order){
        int sum=0;
        for (int i = 0; i < order.size(); i++) {
            sum+=order.get(i).getPrice();
        }
        return  sum<this.money*0.9;
    }

    public String getName() {
        return this.name;
    }
}
