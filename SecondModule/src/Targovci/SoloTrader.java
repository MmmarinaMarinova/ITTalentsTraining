package Targovci;

import java.util.ArrayList;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class SoloTrader extends Trader {
    public SoloTrader(String name, double capital) {
        super(name, capital);
    }

    @Override
    void addDealer(ArrayList<Dealer> dealers) {
        Dealer dealer=getRandomDealer(dealers);
        if(dealer.isRetail()){
            if(this.getDealers().size()==0){
                this.getDealers().add(dealer);
                System.out.println("Solo trader got dealer "+dealer.getName());
            }
        }else{
            System.out.println("This is not a retail dealer, add another one!");
            addDealer(dealers);
        }
    }

    @Override
    void addShop(ArrayList<Shop> shops) {
        System.out.println("Solo traders cannot have shops.");
    }

    @Override
    void payTaxes() {
        System.out.println("The solo traders don't pay taxes!");
    }

    @Override
    void makeOrder() {
        System.out.println("The solo traders don't make orders!");
    }

    @Override
    void getProfitFromShop() {
        System.out.println("The solo traders don't have shops.");
    }
}
