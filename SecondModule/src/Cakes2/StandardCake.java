package Cakes2;

/**
 * Created by Marina on 28.8.2017 г..
 */
public class StandardCake extends Cake {
    private boolean hasSyrop;

    public StandardCake(String name, String description, double price, int pieces, String kindOfCake, int availability, boolean hasSyrop) {
        super(name, description, price, pieces, kindOfCake, availability);
        this.hasSyrop = hasSyrop;
    }

    @Override
    cakeType getTypeOfCake() {
        return cakeType.STANDARD_CAKE;
    }
}
