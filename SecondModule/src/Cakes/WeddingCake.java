package Cakes;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class WeddingCake extends Cake {
    private int layers;

    public WeddingCake(String name, String description, double price, int pieces, int layers) {
        super(name, description, price, pieces);
        this.type.add("Big");
        this.type.add("Medium");
        this.type.add("Small");
        this.layers = layers;
    }
    public WeddingCake(String name, String description, double price, int pieces, int layers, String typeOfCake) {
        super(name, description, price, pieces, typeOfCake);
        this.type.add("Big");
        this.type.add("Medium");
        this.type.add("Small");
        this.layers = layers;
    }


    @Override
    boolean isWedding() {
        return true;
    }

    @Override
    boolean isKids() {
        return false;
    }

    @Override
    boolean isSpecial() {
        return false;
    }

    @Override
    boolean isStandard() {
        return false;
    }
}
