package Warehouse;


/**
 * Created by Marina on 25.8.2017 г..
 */
public class Vegetable extends Product {
    public Vegetable(String name, int price,int availability) {
        super(name, price,availability);
    }

    @Override
    boolean isMeat() {
        return false;
    }

    @Override
    boolean isFruit() {
        return false;
    }

    @Override
    boolean isVegetable() {
        return true;
    }
}
