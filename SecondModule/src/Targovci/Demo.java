package Targovci;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Dealer> dealers=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            RetailDealer retailDealer=new RetailDealer("Retail dealer "+(i+1));
            WholesaleDealer wholesaleDealer=new WholesaleDealer("Wholesale dealer "+(i+1));
            dealers.add(retailDealer);
            dealers.add(wholesaleDealer);
        }

        ArrayList<Shop> shops=new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            MallShop mallShop=new MallShop();
            Kiosk kiosk=new Kiosk();
            Stall stall=new Stall();
            shops.add(mallShop);
            shops.add(kiosk);
            shops.add(stall);
        }

        SoloTrader soloTrader=new SoloTrader("Solo trader",100);
        ETrader eTrader=new ETrader("ETrader",500);
        ChainTrader chainTrader=new ChainTrader("Chain trader",3000);

        soloTrader.addShop(shops);
        for (int i = 0; i <new Random().nextInt(5)+1 ; i++) {
            eTrader.addShop(shops);
        }

        for (int i = 0; i < new Random().nextInt(10)+1; i++) {
            chainTrader.addShop(shops);
        }

        ArrayList<Trader> traders=new ArrayList<>();
        traders.add(soloTrader);
        traders.add(eTrader);
        traders.add(chainTrader);

        startWork(traders);

        for (int i = 0; i < shops.size(); i++) {
            shops.get(i).showInfo();
        }

    }

     static void startWork(ArrayList<Trader> traders) {
         for (int i = 0; i < traders.size(); i++) {
             Trader trader=traders.get(i);
             trader.makeOrder();
             trader.getProfitFromShop();
             trader.payTaxes();
         }
    }
}
