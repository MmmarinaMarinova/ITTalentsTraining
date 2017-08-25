package Warehouse;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 25.8.2017 г..
 */
public abstract class Market {
    private String name;

    public Market(String name) {
        this.name = name;
    }

     ArrayList<Product> openMarket(){
        ArrayList<Product> products=new ArrayList<>();
        Fruit banana=new Fruit("banana",new Random().nextInt(5)+1,15);
        Fruit orange=new Fruit("orange",new Random().nextInt(5)+1,15);
        Fruit apple=new Fruit("apple",new Random().nextInt(5)+1,15);
        Vegetable potato=new Vegetable("potato",new Random().nextInt(5)+1,15);
        Vegetable eggplant=new Vegetable("eggplant",new Random().nextInt(5)+1,15);
        Vegetable cucumber=new Vegetable("cucumber",new Random().nextInt(5)+1,15);
        Meat pork=new Meat("pork",new Random().nextInt(10)+3,15);
        Meat beef=new Meat("beef",new Random().nextInt(10)+3,15);
        Meat chicken=new Meat("chicken",new Random().nextInt(10)+3,15);
        products.add(banana);
        products.add(orange);
        products.add(apple);
        products.add(potato);
        products.add(eggplant);
        products.add(cucumber);
        products.add(pork);
        products.add(beef);
        products.add(chicken);
        System.out.println(this.name+" has been opened! Welcome");
        return products;
    }

    public String getName() {
        return this.name;
    }

}
