package Cakes2;

import java.util.ArrayList;

/**
 * Created by Marina on 28.8.2017 г..
 */
public class WeddingCake extends Cake{
    private int layers;

    public WeddingCake(String name, String description, double price, int pieces, String kindOfCake, int availability, int layers) {
        super(name, description, price, pieces, kindOfCake, availability);
        this.layers = layers;
    }

    @Override
    cakeType getTypeOfCake() {
        return cakeType.WEDDING_CAKE;
}
}
