package Restaurant;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Alcohol  extends Drink{

    public Alcohol(String name) {
        super(name, 4);
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
