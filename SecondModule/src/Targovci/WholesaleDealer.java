package Targovci;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class WholesaleDealer extends Dealer {
    private int discount; //in percentage
    private double money;

    public WholesaleDealer(String name) {
        super(name);
        this.discount = 15;
    }

    @Override
    boolean isRetail() {
        return false;
    }

    @Override
    public void makeDiscount(Order order, Trader trader) {
        double discount=order.calculatePrice()*this.discount/100;
        this.money-=discount;
        trader.setCapital(trader.getCapital()+discount);
        System.out.println(trader.getName()+" got discount: "+discount+" from "+this.getName());
    }
}
