package Warehouse;

import java.util.Random;

/**
 * Created by Marina on 25.8.2017 г..
 */
public abstract class Product {
    private String name;
    private int availability;
    private int price;

    public Product(String name,int price, int availability) {
        this.name = name;
        this.availability = availability;
        this.price =price;
    }

    public int getAvailability() {
        return this.availability;
    }

     void increaseAvailability(int i) {
        if(i>0){
            this.availability+=i;
            System.out.println("Added "+i+" pieces from "+this.name);
        }else{
            System.out.println("More than 0 pieces should be added to "+this.name);
        }
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAvailable(int deficiencyNumber) {
        return this.availability>deficiencyNumber;
    }

    public void decreaseAvailability(int desiredCount) {
        if(desiredCount>this.availability){
            System.out.println("The desired quantity is not available.");
        }else{
            this.availability-=desiredCount;
        }
    }

    public int calculatePrice(int quantity) {
        return this.price*quantity;
    }

    abstract boolean isMeat();
    abstract boolean isFruit();
    abstract boolean isVegetable();

    public void printInfo() {
        System.out.println("Name: "+this.getName());
        System.out.println("Price: "+this.getPrice());
        System.out.println("Availability: "+this.getAvailability());
    }

}
