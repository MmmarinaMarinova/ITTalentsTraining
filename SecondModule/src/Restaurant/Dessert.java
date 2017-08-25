package Restaurant;

import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Dessert extends Dish {

    public Dessert(String name) {
        super(name, 4, new Random().nextInt(100)+200);
    }

    @Override
    boolean isVeganProduct() {
        return false;
    }

    @Override
    boolean isMutraProduct() {
        return false;
    }
}
