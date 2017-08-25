package Vinetki;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class Bus extends Vehicle {
    public Bus(String model) {
        super(model);
    }

    @Override
    boolean isCar() {
        return false;
    }

    @Override
    boolean isTruck() {
        return false;
    }

    @Override
    boolean isBus() {
        return true;
    }
}
