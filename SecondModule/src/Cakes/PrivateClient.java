package Cakes;

import Restaurant.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class PrivateClient extends Client {
    private ArrayList<Integer> vouchers;

    public PrivateClient(String name, String phone, double money) {
        super(name, phone, money,2);
        this.vouchers = new ArrayList<>();
        generateVouchers();
    }

    private void generateVouchers() {
        int countOfVouchers=new Random().nextInt(4)+1;
        for (int i = 0; i < countOfVouchers; i++) {
            vouchers.add(new Random().nextInt(20)+10);
        }
    }

    @Override
    void orderCakes(CakeShop cakeShop, String address) {

    }

    @Override
    public void payOrder(Order order) {

    }

    @Override
    public boolean isCorporate() {
        return false;
    }

    @Override
    public boolean isPrivate() {
        return true;
    }

    double calculateDiscount(){
        double amount=0;
        for (Integer v:this.vouchers) {
            amount+=v;
        }
        return amount;
    }
}
