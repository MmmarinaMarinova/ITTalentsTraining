package Targovci;

import java.util.ArrayList;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class ChainTrader extends Trader{

    public ChainTrader(String name, double capital) {
        super(name, capital);
    }

    @Override
    void addDealer(ArrayList<Dealer> dealers) {
        Dealer dealer=getRandomDealer(dealers);
            if(this.getDealers().size()<0){
                this.getDealers().add(dealer);
                System.out.println("Chain trader got dealer "+dealer.getName());
            }
    }

    @Override
    void addShop(ArrayList<Shop> shops) {
        if(this.getShops().size()<10){
            Shop shop=this.getRandomShop(shops);
            this.getShops().add(shop);
            System.out.println("A shop was added to "+this.getName());
        }else{
            System.out.println("A chain trader cannot have more than 10 shops.");
        }
    }
}
