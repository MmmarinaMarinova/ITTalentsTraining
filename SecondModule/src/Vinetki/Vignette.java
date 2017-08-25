package Vinetki;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Marina on 22.8.2017 г..
 */
public abstract class Vignette {
    private LocalDate dateOfPurchase;
    private String color;
    private Period validityPeriod;
    private double price;
    public  double dailyPrice;

    public Vignette(String color, Period validityPeriod,double dailyPrice) {
        this.color = color;
        this.validityPeriod = validityPeriod;
        this.dailyPrice=dailyPrice;
        calculatePrice(validityPeriod);
    }

    public  void calculatePrice(Period validityPeriod){
        if(validityPeriod.getDays()==1){
            this.price= this.dailyPrice;
        }else if(validityPeriod.getMonths()==1){
            this.price= this.dailyPrice*10;
        }else{
            this.price= this.dailyPrice*60;
        }
    }

    abstract boolean forCar();
    abstract boolean forBus();
    abstract boolean forTruck();


    public double getPrice() {
        return this.price;
    }

    abstract int stickToWindow(Vehicle v);

    public Period getValidityPeriod() {
        return this.validityPeriod;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public LocalDate getDateOfPurchase() {
        return this.dateOfPurchase;
    }



    public boolean isRight(int choice) {
        if(choice==1){
            return forCar();
        }
        if(choice==2){
            return forBus();
        }
        if(choice==3){
            return forTruck();
        }
        return false;
    }

    @Override
    public String toString() {
        return this.color+" "+this.price;
    }
}
