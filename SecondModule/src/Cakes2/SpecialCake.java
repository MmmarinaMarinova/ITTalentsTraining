package Cakes2;

/**
 * Created by Marina on 28.8.2017 г..
 */
public class SpecialCake extends Cake {
    private String eventName;

    public SpecialCake(String name, String description, double price, int pieces, String kindOfCake, int availability, String eventName) {
        super(name, description, price, pieces, kindOfCake, availability);
        this.eventName = eventName;
    }

    @Override
    cakeType getTypeOfCake() {
        return cakeType.SPECIAL_CAKE;
    }
}
