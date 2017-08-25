package Targovci;

import java.util.Random;

/**
 * Created by Marina on 19.8.2017 г..
 */
public class MallShop extends Shop {
    public MallShop() {
        super(150, new Random().nextInt(90)+10);
    }

    @Override
    public boolean isMallShop(Shop shop) {
        return true;
    }

    @Override
    public boolean isStall(Shop shop) {
        return false;
    }

    @Override
    public boolean isKiosk(Shop shop) {
        return false;
    }
}
