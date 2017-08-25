package Targovci;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class ETrader extends Trader {
    public ETrader(String name, double capital) {
        super(name, capital);
    }

    @Override
    void addDealer(ArrayList<Dealer> dealers) {
        Dealer dealer=getRandomDealer(dealers);
        if(dealer.isRetail()){
            if(this.getDealers().size()<5){
                this.getDealers().add(dealer);
                System.out.println("ETrader  got dealer "+dealer.getName());
            }
        }else{
            System.out.println("This is not a retail dealer, add another one!");
            addDealer(dealers);
        }
    }

    @Override
    void addShop(ArrayList<Shop> shops) {
        if(this.getShops().size()==0){
            Shop shop=this.getRandomShop(shops);
            if(shop.isStall(shop) || shop.isKiosk(shop)){
                this.getShops().add(shop);
                System.out.println("A shop was added to "+this.getName());
            }else{
                System.out.println("Try to add shop again!");
                addShop(shops);
            }
        }
    }
}
