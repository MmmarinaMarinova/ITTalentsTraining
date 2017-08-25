package Vinetki;

import java.time.Period;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class TruckVignette extends Vignette {
    public TruckVignette(Period validityPeriod) {
        super("yellow", validityPeriod, 7);
    }

    @Override
    boolean forCar() {
        return false;
    }

    @Override
    boolean forBus() {
        return false;
    }

    @Override
    boolean forTruck() {
        return true;
    }


    @Override
    int stickToWindow(Vehicle v) {
        v.setVignette(this);
        return 10;
    }

}
