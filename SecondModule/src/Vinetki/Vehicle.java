package Vinetki;

import java.util.Random;

/**
 * Created by Marina on 22.8.2017 г..
 */
public abstract class Vehicle {
    private String model;
    private Vignette vignette;
    private int yearOfProduction;

    public Vehicle(String model) {
        this.model = model;
        this.yearOfProduction = new Random().nextInt(100)+1900;
    }

    public void setVignette(Vignette vignette) {
        this.vignette = vignette;
    }

    public Vignette getVignette() {
        return this.vignette;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Model: "+this.model+"\n");
        stringBuilder.append("Year of production: "+this.yearOfProduction+"\n");
        stringBuilder.append("*******************");
        return stringBuilder.toString();
    }

    public String getModel() {
        return this.model;
    }

    abstract boolean isCar();
    abstract boolean isTruck();
    abstract boolean isBus();
}
