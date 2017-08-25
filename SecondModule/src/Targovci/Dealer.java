package Targovci;

/**
 * Created by Marina on 19.8.2017 г..
 */
public abstract class Dealer {
    private String name;
    private String address;
    private String workingTime;
    private double money;

    public Dealer(String name) {
        this.name = name;
        this.address="Sofia";
        this.workingTime="8:00 - 20:00";
        this.money=0.0;
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

    abstract boolean isRetail();

    public abstract void makeDiscount(Order order, Trader trader);

}
