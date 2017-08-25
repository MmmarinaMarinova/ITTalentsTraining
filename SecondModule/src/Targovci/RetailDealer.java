package Targovci;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class RetailDealer extends  Dealer {
    public RetailDealer(String name) {
        super(name);
    }

    @Override
    boolean isRetail() {
        return true;
    }

    @Override
    public void makeDiscount(Order order, Trader trader) {
        System.out.println(this.getName()+" is a small dealer and cannot make discounts, sorry.");
    }
}
