package Targovci;

import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class Stall extends Shop {
    public Stall() {
        super(50, new Random().nextInt(8)+2);
    }

    @Override
    public boolean isStall(Shop shop) {
        return true;
    }

    @Override
    public boolean isKiosk(Shop shop) {
        return false;
    }

    @Override
    public boolean isMallShop(Shop shop) {
        return false;
    }
}
