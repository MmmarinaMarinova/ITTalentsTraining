package Cakes2;

/**
 * Created by Marina on 28.8.2017 г..
 */
public class KidsCake extends Cake {
    private String kidName;

    public KidsCake(String name, String description, double price, int pieces, String kindOfCake, int availability, String kidName) {
        super(name, description, price, pieces, kindOfCake, availability);
        this.kidName = kidName;
    }

    @Override
    cakeType getTypeOfCake() {
        return cakeType.KIDS_CAKE;
    }
}
