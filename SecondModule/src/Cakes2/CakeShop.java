package Cakes2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Marina on 28.8.2017 г..
 */
public class CakeShop {
    private String name;
    private String address;
    private double money;
    private double profit;
    private HashSet<DeliveryGuy> deliveryGuys;
    private HashMap<Cake.cakeType,HashMap<String,Cake>> availableCakes;

    public CakeShop(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
        this.profit = 0.0;
        this.deliveryGuys = new HashSet<>();
        this.availableCakes = new HashMap<>();
        generateCakes();
    }

    private void generateCakes() {
        this.availableCakes.put(Cake.cakeType.STANDARD_CAKE, new HashMap<>());
        this.availableCakes.put(Cake.cakeType.WEDDING_CAKE, new HashMap<>());
        this.availableCakes.put(Cake.cakeType.SPECIAL_CAKE, new HashMap<>());
        this.availableCakes.put(Cake.cakeType.KIDS_CAKE, new HashMap<>());

        this.availableCakes.get(Cake.cakeType.STANDARD_CAKE).put("Shokoladovo izkushenie", new StandardCake("Shokoladovo izkushenie","Mnogo qka torta",30,12,"Chocolate cake",3,false));
        this.availableCakes.get(Cake.cakeType.STANDARD_CAKE).put("Plodovo izkushenie", new StandardCake("Plodovo izkushenie","Sveja torta",35,16,"Fruit cake",4,true));
        this.availableCakes.get(Cake.cakeType.STANDARD_CAKE).put("Biskviteno izkushenie", new StandardCake("Biskviteno izkushenie"," Torta s biskvitki",25,8,"Biscuit cake",6,false));
        this.availableCakes.get(Cake.cakeType.STANDARD_CAKE).put("Eklerovo izkushenie", new StandardCake("Eklerovo izkushenie","Eklerova torta",40,12,"Eclair cake",3,true));
        this.availableCakes.get(Cake.cakeType.KIDS_CAKE).put("Birthday cake", new KidsCake("Birthday cake","Torta za rojden den",45,12,"Birthday cake",1,"Peshko"));
        this.availableCakes.get(Cake.cakeType.KIDS_CAKE).put("First step cake", new KidsCake("First step cake","Torta za prohojdane den",20,12,"First step cake",0,"Goshko"));
        this.availableCakes.get(Cake.cakeType.KIDS_CAKE).put("Baptism cake", new KidsCake("Baptism cake","Torta za krushtene den",20,12,"Baptism cake",3,"Toshko"));
        this.availableCakes.get(Cake.cakeType.SPECIAL_CAKE).put("Anniversary cake",new SpecialCake("Anniversary cake","Torta za iubilei",60,24,"Anniversary cake", 5,"Wedding anniversary"));
        this.availableCakes.get(Cake.cakeType.WEDDING_CAKE).put("Wedding cake",new WeddingCake("Wedding cake","Beautiful cake", 100,48,"Wedding cake",3, 3));
    }

    void sellCake(String cakeName,int quantity){
        Cake toBeSold=null;
        for (HashMap<String, Cake> razdel: this.availableCakes.values()) {
            if(razdel.containsKey(cakeName)){
                toBeSold=razdel.get(cakeName);
            }
        }
        if(toBeSold==null){
            System.out.println("We do not have this cake in the shop.");
        }
        if(toBeSold.getAvailability()<quantity){
            System.out.println("We don't have enough of that cake. Available: "+toBeSold.getAvailability());
        }else{
            toBeSold.decreaseAvailability(quantity);
            System.out.println("You got the cakes");
            this.money+=quantity*toBeSold.getPrice();
            this.profit+=quantity*toBeSold.getPrice();
        }
    }
}
