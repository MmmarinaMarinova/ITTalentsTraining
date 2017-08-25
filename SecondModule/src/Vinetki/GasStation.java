package Vinetki;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class GasStation {
    private double dailyProfit;
    private ArrayList<Vignette> availableVignettes;

    public GasStation() {
        this.dailyProfit=0;
        this.availableVignettes=new ArrayList<>();
        generateAvailableVignettes();
    }

    public ArrayList<Vignette> getAvailableVignettes() {
        return this.availableVignettes;
    }

    public void setDailyProfit(double dailyProfit) {
        this.dailyProfit = dailyProfit;
    }

    public double getDailyProfit() {
        return this.dailyProfit;
    }

    private void generateAvailableVignettes() {
        Period period=getRandomPeriod();
        Vignette vignette;
        for (int i = 0; i < 10_000; i++) {
            int type=new Random().nextInt(3);

            if(type==0){
                vignette=new CarVignette(period);
            }else if(type==1){
                vignette=new BusVignette(period);
            }else{
                vignette=new TruckVignette(period);
            }
            this.availableVignettes.add(vignette);
            Collections.sort(this.availableVignettes, ((v1,v2)-> (int)(v1.getPrice()-v2.getPrice())));
        }
    }

    public Period getRandomPeriod() {
        int period=new Random().nextInt(100);
        if(period<33){
            return Period.ofDays(1);
        }else if(period>=33 && period<67){
            return Period.ofMonths(1);
        }else{
            return Period.ofYears(1);
        }
    }

    public Vignette sellVignette(Period period, Vehicle v, Driver driver) {

        if(v.isCar()){
            return getAVignette(period, 1);
        }else if(v.isBus()){
            return getAVignette(period,2);
        }else{
            return getAVignette(period,3);
        }

    }


    private Vignette getAVignette(Period period, int choice) {
        Vignette vignette=null;
        for (Vignette v:availableVignettes) {
           if(v.isRight(choice) && period.equals(v.getValidityPeriod())){
               vignette=v;
               vignette.setDateOfPurchase(LocalDate.now());
               this.availableVignettes.remove(vignette);
               break;
           }
        }
        if(vignette==null){
            System.out.println("There is no available vignette for this vehicle.");
        }
        return vignette;
    }


    public void sortVignettes() {
        Collections.sort(this.availableVignettes, ((v1, v2)->(int)(v1.getPrice()-v2.getPrice())));
    }
}
