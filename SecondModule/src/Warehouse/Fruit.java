package Warehouse;



/**
 * Created by Marina on 25.8.2017 г..
 */
public class Fruit extends Product {
    public Fruit(String name, int price, int availability) {
        super(name, price, availability);
    }

    @Override
    boolean isMeat() {
        return false;
    }

    @Override
    boolean isFruit() {
        return true;
    }

    @Override
    boolean isVegetable() {
        return false;
    }


}
