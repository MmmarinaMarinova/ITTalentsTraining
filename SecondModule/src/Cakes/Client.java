package Cakes;

/**
 * Created by Marina on 27.8.2017 г..
 */
public abstract class Client {
    private String name;
    private String phone;
    private double money;
    private int tipPercent;

    public Client(String name, String phone, double money,int tipPercent) {
        this.name = name;
        this.phone = phone;
        this.money = money;
        this.tipPercent=tipPercent;
    }

    abstract void orderCakes(CakeShop cakeShop, String address);

    public abstract boolean isCorporate();
    public abstract boolean isPrivate();

    public abstract void payOrder(Order order);

}
