package Cakes;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 27.8.2017 г..
 */
public abstract class Cake {
    private String name;
    private String description;
    private double price;
    private int pieces;
    protected ArrayList<String> type;
    private String typeOfCake;

    public Cake(String name, String description, double price, int pieces) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.pieces = pieces;
        this.type = new ArrayList<>();
        this.typeOfCake=type.get(new Random().nextInt(type.size()));
    }

    public Cake(String name, String description, double price, int pieces, String typeOfCake) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.pieces = pieces;
        this.type=new ArrayList<>();
        this.typeOfCake = typeOfCake;
    }

    abstract boolean isWedding();
    abstract boolean isKids();
    abstract boolean isSpecial();
    abstract boolean isStandard();

    public double getPrice() {
        return this.price;
    }

    public int getPieces() {
        return this.pieces;
    }

    public String getName() {
        return this.name;
    }
}
