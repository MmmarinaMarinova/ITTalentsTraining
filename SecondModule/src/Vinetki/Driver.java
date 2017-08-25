package Vinetki;

import sun.dc.path.PathError;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class Driver {
    private String name;
    private ArrayList<Vehicle> vehicles;
    private double money;
    private GasStation gasStation;

    public Driver(String name) {
        this.name = name;
        this.vehicles=new ArrayList<>();
        this.money=new Random().nextDouble()*100+4000;
    }

    public void setGasStation(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
        System.out.println("Vehicle added to "+this.name+" "+vehicle.getModel());
    }

    void buyVignetteForAllVehicles(){
        for (Vehicle v:this.vehicles) {
            this.buyOneVignette(v);
        }
    }

     void buyOneVignette(Vehicle v) {
        Period period=this.gasStation.getRandomPeriod();
            Vignette vignette=this.gasStation.sellVignette(period,v,this);
            if(this.money>=vignette.getPrice()){
                this.payVignette(this.gasStation,vignette);
                System.out.println("Vignette stuck to window for: "+vignette.stickToWindow(v)+" seconds");
            }else{
                System.out.println(this.name+" doesn't have enough money for this vignette");
                this.gasStation.getAvailableVignettes().add(vignette);
            this.gasStation.sortVignettes();
        }

    }

    private void payVignette(GasStation gasStation, Vignette vignette) {
        this.money-=vignette.getPrice();
        gasStation.setDailyProfit(gasStation.getDailyProfit()+vignette.getPrice());
        gasStation.getAvailableVignettes().remove(vignette);
        System.out.println(this.name+" just bought a vignette: " +vignette.toString());
    }

    void findInvalidVignettes(){
        for (Vehicle vehicle : this.vehicles) {
            Vignette v=vehicle.getVignette();
            if(LocalDate.now().isAfter(v.getDateOfPurchase().plus(v.getValidityPeriod()))){
                System.out.println("Outdated vignette for vehicle: "+vehicle.toString());
            } else if(v==null){
                System.out.println("This vehicle has no vignette: "+vehicle.toString());
            }
        }
    }

    public Vehicle getRandomVehicle() {
        return this.vehicles.get(new Random().nextInt(this.vehicles.size()));
    }

    public void showInfo() {
        System.out.println("Driver name: "+this.name);
        System.out.println("Money: "+this.money);
        System.out.println("Vehicles driven: "+this.vehicles.size());
        findInvalidVignettes();
    }
}
