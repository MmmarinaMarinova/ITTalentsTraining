package Targovci;

import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class Kiosk extends Shop {
    public Kiosk() {
        super(50, new Random().nextInt(2)+4);
    }

    @Override
    public boolean isKiosk(Shop shop) {
        return true;
    }

    @Override
    public boolean isMallShop(Shop shop) {
        return false;
    }

    @Override
    public boolean isStall(Shop shop) {
        return false;
    }
}
