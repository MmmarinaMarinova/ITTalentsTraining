package Restaurant;

import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Salad extends Dish {

    public Salad(String name) {
        super(name, 5, new Random().nextInt(300)+300);
    }

    @Override
    boolean isVeganProduct() {
        return true;
    }

    @Override
    boolean isMutraProduct() {
        return false;
    }
}
