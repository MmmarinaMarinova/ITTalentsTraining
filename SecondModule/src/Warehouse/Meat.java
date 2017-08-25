package Warehouse;

/**
 * Created by Marina on 25.8.2017 г..
 */
public class Meat extends Product {
    public Meat(String name, int price, int availability) {
        super(name, price,availability);
    }

    @Override
    boolean isMeat() {
        return true;
    }

    @Override
    boolean isFruit() {
        return false;
    }

    @Override
    boolean isVegetable() {
        return false;
    }
}
