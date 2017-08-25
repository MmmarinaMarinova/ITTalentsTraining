package Vinetki;

import java.util.Random;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    boolean isCar() {
        return true;
    }

    @Override
    boolean isTruck() {
        return false;
    }

    @Override
    boolean isBus() {
        return false;
    }
}
