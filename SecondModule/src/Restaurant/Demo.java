package Restaurant;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 18.8.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        //tochka 1
        Restaurant restaurant=new Restaurant();
        ArrayList<Waiter> waiters=new ArrayList<Waiter>();
        for (int i = 0; i < 5; i++) {
            Waiter waiter=new Waiter("Waiter"+(i+1));
            waiters.add(waiter);
        }
        restaurant.setWaiters(waiters);

        //tochka 2
        Random random=new Random();
        ArrayList<Client> clients=new ArrayList<Client>();
        for (int i = 0; i < 15; i++) {
            Client client;
            int chance=random.nextInt(100);
            if(chance<=20){
                client=new Vegan("Vegan bebe"+(i+1),restaurant);
            }else if(chance>20 && chance<=50){
                client=new Student("Beden student"+(i+1), restaurant);
            }else{
                client=new Mutra("Mutryaga"+(i+1),restaurant);
            }
            clients.add(client);
        }

        //tochka 3
        simulateWork(restaurant,clients);

        //tochka 4
        restaurant.showRestaurantInfo();

        //tochka 5 i 6
        for (int i = 0; i < restaurant.getWaiters().size(); i++) {
            restaurant.getWaiters().get(i).showInfo();
        }

        //tochka 7
        restaurant.printAvailableProducts();



    }

    static void simulateWork(Restaurant restaurant,ArrayList<Client> clients){
        restaurant.setClients(clients);
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).order(restaurant);
            clients.get(i).payCheck();
            //the client is asking for the check in payCheck();
        }
    }

}
