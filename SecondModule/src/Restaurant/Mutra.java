package Restaurant;

import java.util.ArrayList;

/**
 * Created by Marina on 17.8.2017 г..
 */
public class Mutra extends Client {
    public Mutra(String name, Restaurant restaurant) {
        super(name, 50, restaurant);
    }

    @Override
    void order(Restaurant restaurant) {
        this.waiter=restaurant.getRandomWaiter();
        ArrayList<MenuProduct> order=new ArrayList<>();
        this.order=order;
        Dish dish;
        do{
            dish=restaurant.menu.getRandomDish();
        }while(!dish.isMutraProduct());
        order.add(dish);
        System.out.println(this.getName()+" would like to order "+dish.getName());

        Drink drink;
        do{
            drink=restaurant.menu.getRandomDrink();
        }while(!drink.isMutraProduct());
        order.add(drink);
        System.out.println(this.getName()+" would like to order "+dish.getName());

        if(canOrder(order)){
            //this.order=order;
            waiter.takeOrder(order);
            System.out.println(this.getName()+" makes an order");
        }else{
            System.out.println(this.getName()+" cannot enough money for this!");
        }
    }


}
