package Restaurant;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Menu {
    private ArrayList<Dish> dishes;
    private ArrayList<Drink> drinks;

    public Menu() {
        this.dishes = new ArrayList<Dish>();
        this.drinks = new ArrayList<Drink>();
    }

    public ArrayList<Dish> getDishes() {
        return this.dishes;
    }

    public ArrayList<Drink> getDrinks() {
        return this.drinks;
    }

    public Dish getRandomDish() {
        return this.dishes.get(new Random().nextInt(dishes.size()));
    }

    public Drink getRandomDrink() {
        return this.drinks.get(new Random().nextInt(drinks.size()));
    }
}
