package Cakes;

import Restaurant.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class CorporateClient extends Client{
    private int discount=10;

    public CorporateClient(String name, String phone, double money) {
        super(name, phone, money, 5);
    }

    @Override
    void orderCakes(CakeShop cakeShop,String address) {
        ArrayList<Cake> cakes=new ArrayList<>();
        int countOfCakes=new Random().nextInt(3)+2;
        for (int i = 0; i <countOfCakes ; i++) {
            cakes.add(cakeShop.getRandomCake());
        }
        cakeShop.makeOrder(this,cakes,address);
    }




    @Override
    public boolean isCorporate() {
        return true;
    }

    @Override
    public boolean isPrivate() {
        return false;
    }

    public int getDiscount() {
        return this.discount;
    }
}
