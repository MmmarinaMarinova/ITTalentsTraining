package Restaurant;

/**
 * Created by Marina on 17.8.2017 г..
 */
public abstract class Dish extends MenuProduct{
    private int weight;

    public Dish(String name, double price, int weight) {
        super(10, name, price);
        this.weight = weight;
    }


}
