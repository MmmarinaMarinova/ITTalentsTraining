package Vinetki;

import java.time.Period;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class BusVignette extends Vignette {
    public BusVignette(Period validityPeriod) {
        super("pink", validityPeriod, 9);
    }

    @Override
    boolean forCar() {
        return false;
    }

    @Override
    boolean forBus() {
        return true;
    }

    @Override
    boolean forTruck() {
        return false;
    }

    @Override
    int stickToWindow(Vehicle vehicle) {
        vehicle.setVignette(this);
        return 20;
    }
}
