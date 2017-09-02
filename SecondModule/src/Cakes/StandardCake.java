package Cakes;

import java.util.ArrayList;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class StandardCake extends Cake {
    private boolean hasSyrop;


    public StandardCake(String name, String description, double price, int pieces, boolean hasSyrop) {
        super(name, description, price, pieces);
        this.type.add("Biscuit cake");
        this.type.add("Eclaire cake");
        this.type.add("Fruit cake");
        this.type.add("Chocolate cake");
        this.hasSyrop=hasSyrop;
    }

    public StandardCake(String name, String description, double price, int pieces, boolean hasSyrop, String typeOfCake) {
        super(name, description, price, pieces,typeOfCake);
        this.type.add("Biscuit cake");
        this.type.add("Eclaire cake");
        this.type.add("Fruit cake");
        this.type.add("Chocolate cake");
    }

    @Override
    boolean isWedding() {
        return false;
    }

    @Override
    boolean isKids() {
        return false;
    }

    @Override
    boolean isSpecial() {
        return false;
    }

    @Override
    boolean isStandard() {
        return true;
    }
}
