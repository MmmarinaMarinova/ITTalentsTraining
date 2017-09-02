package Cakes;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class KidsCake extends Cake {
    private String kidName;

    public KidsCake(String name, String description, double price, int pieces, String kidName) {
        super(name, description, price, pieces);
        this.type.add("Birthday Cake");
        this.type.add("Baptism Cake");
        this.type.add("First Step Cake");
        this.kidName = kidName;
    }

    @Override
    boolean isWedding() {
        return false;
    }

    @Override
    boolean isKids() {
        return true;
    }

    @Override
    boolean isSpecial() {
        return false;
    }

    @Override
    boolean isStandard() {
        return false;
    }

    public KidsCake(String name, String description, double price, int pieces, String typeOfCake, String kidName) {
        super(name, description, price, pieces, typeOfCake);
        this.type.add("Birthday Cake");
        this.type.add("Baptism Cake");
        this.type.add("First Step Cake");
        this.kidName = kidName;
    }
}
