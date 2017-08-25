package Vinetki;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class CarVignette extends Vignette {

    public CarVignette(Period validityPeriod) {
        super("green", validityPeriod, 5);
    }

    @Override
    boolean forCar() {
        return true;
    }

    @Override
    boolean forBus() {
        return false;
    }

    @Override
    boolean forTruck() {
        return false;
    }

    @Override
    int stickToWindow(Vehicle v) {
        v.setVignette(this);
        return 5;
    }
}
