package Vinetki;

/**
 * Created by Marina on 22.8.2017 г..
 */
public class Truck extends Vehicle {
    public Truck(String model) {
        super(model);
    }

    @Override
    boolean isCar() {
        return false;
    }

    @Override
    boolean isTruck() {
        return true;
    }

    @Override
    boolean isBus() {
        return false;
    }
}
