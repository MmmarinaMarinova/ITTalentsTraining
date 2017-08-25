package Restaurant;


import java.util.ArrayList;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Student extends Client {

    public Student(String name, Restaurant restaurant) {
        super(name, 10, restaurant);
    }

    @Override
    void order(Restaurant restaurant) {
        this.waiter=restaurant.getRandomWaiter();
        ArrayList<MenuProduct> order=new ArrayList<>();
        this.order=order;
        Dish dish=restaurant.menu.getRandomDish();
        order.add(dish);
        System.out.println(this.getName()+" would like to order "+dish.getName());

        Drink drink=restaurant.menu.getRandomDrink();
        order.add(drink);
        System.out.println(this.getName()+" would like to order "+drink.getName());

        if(canOrder(order)){

            waiter.takeOrder(order);
            System.out.println(this.getName()+" makes an order");
        }else{
            System.out.println(this.getName()+" cannot enough money for this!");
        }
    }
}
