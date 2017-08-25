package Vinetki;

import Restaurant.Drink;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        GasStation gasStation=new GasStation();
        System.out.println(gasStation.getAvailableVignettes().size());

        ArrayList<Driver> drivers=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Driver driver=new Driver("Driver "+(i+1));
            driver.setGasStation(gasStation);
            drivers.add(driver);
        }

        Random random=new Random();
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int chance=random.nextInt(3);
            Vehicle vehicle;
                if(chance==0){
                    vehicle=new Car("Car "+(i+1));
                    vehicles.add(vehicle);
                }else if(chance==1){
                    vehicle=new Bus("Bus "+(i+1));
                    vehicles.add(vehicle);
                }else{
                    vehicle=new Truck("Truck "+(i+1));
                    vehicles.add(vehicle);
                }
        }

        for (int i = 0; i < drivers.size(); i++) {
            for (int j = 0; j < 10; j++) {
                Vehicle vehicle=getRandomVehicle(vehicles);
                drivers.get(i).addVehicle(vehicle);
                vehicles.remove(vehicle);
            }
        }

        for (int i = 0; i < drivers.size(); i++) {
            if(i%3==0){
                for (int j = 0; j < 5; j++) {
                    drivers.get(i).buyOneVignette(drivers.get(i).getRandomVehicle());
                }
            }else{
                drivers.get(i).buyVignetteForAllVehicles();
            }
        }

        for (int i = 0; i < drivers.size() ; i++) {
            drivers.get(i).showInfo();
        }

        for (int i = 0; i < gasStation.getAvailableVignettes().size(); i++) {
            System.out.println(gasStation.getAvailableVignettes().get(i).toString());
        }
    }

     static Vehicle getRandomVehicle(ArrayList<Vehicle> vehicles) {
        return vehicles.get(new Random().nextInt(vehicles.size()));
    }
}
