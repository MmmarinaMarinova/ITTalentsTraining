package Restaurant;

import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class MainDish extends Dish {

    public MainDish(String name) {
        super(name, 9, new Random().nextInt(400)+400);
    }

    @Override
    boolean isMutraProduct() {
        return true;
    }

    @Override
    boolean isVeganProduct() {
        return false;
    }
}
