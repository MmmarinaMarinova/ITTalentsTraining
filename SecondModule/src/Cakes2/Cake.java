package Cakes2;
import java.util.ArrayList;

/**
 * Created by Marina on 28.8.2017 г..
 */
public abstract class Cake {


    protected enum cakeType{
            STANDARD_CAKE, WEDDING_CAKE, KIDS_CAKE,SPECIAL_CAKE
    }

    private String name;
    private String description;
    private double price;
    private int pieces;
    private cakeType typeOfCake;
    private ArrayList<String> kindsOfCakeArray;
    private String kindOfCake;
    private int availability;

    public Cake(String name, String description, double price, int pieces, String kindOfCake, int availability) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.pieces = pieces;
        this.typeOfCake = getTypeOfCake();
        this.kindsOfCakeArray = new ArrayList<>();
        this.kindOfCake=kindOfCake;
        this.availability=availability;
    }

    abstract cakeType getTypeOfCake();

    public int getAvailability() {
        return this.availability;
    }

    public void decreaseAvailability(int quantity) {
        //todo
    }

    public double getPrice() {
        return this.price;
    }
}
