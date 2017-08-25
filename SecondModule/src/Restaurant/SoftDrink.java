package Restaurant;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class SoftDrink extends Drink {
    public SoftDrink(String name) {
        super(name, 2);
    }

    @Override
    boolean isMutraProduct() {
        return false;
    }

    @Override
    boolean isVeganProduct() {
        return true;
    }

}
