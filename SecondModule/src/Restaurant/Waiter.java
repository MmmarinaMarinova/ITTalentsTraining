package Restaurant;

import java.util.ArrayList;


/**
 * Created by Marina on 17.8.2017 г..
 */
public class Waiter {
    private String    name;
    private double tips;

    public Waiter(String name) {
        this.name = name;
        this.tips=0;
    }

    public void takeOrder(ArrayList<MenuProduct> order) {
        int availableProducts=0;
        for (int i = 0; i < order.size(); i++) {
            if(order.get(i).getAvailability()<=0){
                System.out.println("Sorry, we are out of this product: "+order.get(i).getName());
            }else{
                order.get(i).setAvailability(order.get(i).getAvailability()-1);
                availableProducts++;
            }
        }
        if(availableProducts==0){
            System.out.println("None of your orders is available, please order again");
            return;
        }else{
            System.out.println("Order accepted!");
        }
    }


    public double makeCheck(ArrayList<MenuProduct> order) {
        double finalPrice=0.0;
        System.out.println("********************");
        for (int i = 0; i < order.size(); i++) {
            System.out.println(order.get(i).toString());
            finalPrice+=order.get(i).getPrice();
        }
        System.out.println("Final price: "+finalPrice);
        System.out.println("********************");
        return finalPrice;
    }

    public void setTips(double tips) {
        this.tips = tips;
    }

    public double getTips() {
        return this.tips;
    }

    public void showInfo() {
        System.out.println("The waiter "+this.name+" has "+this.tips+" tips.");
    }
}
