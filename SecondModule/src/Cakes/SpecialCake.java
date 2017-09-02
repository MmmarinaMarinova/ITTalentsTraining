package Cakes;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class SpecialCake extends Cake {
    private String eventName;

    public SpecialCake(String name, String description, double price, int pieces, String eventName) {
        super(name, description, price, pieces);
        this.type.add("Anniversary Cake");
        this.type.add("Company Cake");
        this.type.add("Advertisement Cake");
        this.eventName = eventName;
    }

    @Override
    boolean isWedding() {
        return false;
    }

    @Override
    boolean isKids() {
        return false;
    }

    @Override
    boolean isSpecial() {
        return true;
    }

    @Override
    boolean isStandard() {
        return false;
    }

    public SpecialCake(String name, String description, double price, int pieces, String typeOfCake,String eventName) {
        super(name, description, price, pieces,typeOfCake);
        this.type.add("Anniversary Cake");
        this.type.add("Company Cake");
        this.type.add("Advertisement Cake");
        this.eventName = eventName;
    }
}
