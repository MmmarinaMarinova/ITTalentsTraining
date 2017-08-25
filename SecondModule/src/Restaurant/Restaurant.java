package Restaurant;

import Lesson17.AllWork;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Restaurant {
    private String name;
    private String address;
    private double money;
    protected Menu menu;
    private ArrayList<Waiter> waiters;
    private ArrayList<Client> clients;

    public Restaurant() {
        this.name="Pri Pesho talanta";
        this.address="Sofia";
        this.money=1000.0;
        this.waiters=new ArrayList<Waiter>();
        this.clients=new ArrayList<Client>();
        this.menu=new Menu();
        generateMenu();
    }

    public void setWaiters(ArrayList<Waiter> waiters) {
        this.waiters = waiters;
    }

    public double getMoney() {
        return this.money;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Waiter> getWaiters() {
        return this.waiters;
    }

    private void generateMenu() {
            Salad salad=new Salad("Salad");
            MainDish mainDish=new MainDish("Main dish");
            Dessert dessert=new Dessert("Dessert");
            this.menu.getDishes().add(salad);
            this.menu.getDishes().add(mainDish);
            this.menu.getDishes().add(dessert);

            Alcohol alcohol=new Alcohol("Alcohol");
            SoftDrink softDrink=new SoftDrink("Soft drink");
            this.menu.getDrinks().add(alcohol);
            this.menu.getDrinks().add(softDrink);
    }

    Waiter getRandomWaiter() {
        return this.waiters.get(new Random().nextInt(this.waiters.size()));
    }

    public void showRestaurantInfo() {
        System.out.println("The restaurant "+this.name+" has "+this.money+" money.");
    }

    public void printAvailableProducts() {
        System.out.println("Dishes: \n");
        for (int i = 0; i < this.menu.getDishes().size(); i++) {
            this.menu.getDishes().get(i).showAvailable();
        }

        System.out.println("Drinks: \n");
        for (int i = 0; i < this.menu.getDrinks().size(); i++) {
            this.menu.getDrinks().get(i).showAvailable();
        }
    }
}
