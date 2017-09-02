package Cakes;

import Targovci.*;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

/**
 * Created by Marina on 27.8.2017 г..
 */
public class CakeShop {
    private String name;
    private String address;
    private double money;
    private HashSet<DeliveryGuy> deliveryGuys;
    private HashSet<Cake> catalogue;
    private ArrayList<Cake> cakeDisplay;

    public CakeShop(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
        this.deliveryGuys=new HashSet<>();
        this.catalogue=generateCatalogue();
        this.cakeDisplay =new ArrayList<>();
    }

    private HashSet<Cake> generateCatalogue() {
        HashSet<Cake> catalogue=new HashSet<>();
        catalogue.add(new StandardCake("Standard cake 1","Yummy cake",new Random().nextInt(50)+30,8,true, "Biscuit cake"));
        catalogue.add(new StandardCake("Standard cake 2","Yummy cake",new Random().nextInt(50)+30,12,false, "Eclaire cake"));
        catalogue.add(new StandardCake("Standard cake 3","Yummy cake",new Random().nextInt(50)+30,16,false, "Chocolate cake"));
        catalogue.add(new StandardCake("Standard cake 4","Yummy cake",new Random().nextInt(50)+30,8,true, "Fruit cake"));
        //catalogue.add(new WeddingCake("Wedding cake 1","Beautiful cake",new Random().nextInt(100)+20,)

        return catalogue;
    }

    void sortCakes(){
        Comparator<Cake> compareCakes=new Comparator<Cake>() {
            @Override
            public int compare(Cake o1, Cake o2) {
                    if((o1.isStandard() && o2.isStandard())
                            || (o1.isSpecial() && o2.isSpecial())){
                        return (int)(o1.getPrice()-o2.getPrice());
                    }else
                        return o1.getPieces()-o2.getPieces();
                    }
        };
        cakeDisplay.sort(compareCakes);
    }

    public Collection<Cake> getCatalogue() {
        return Collections.unmodifiableCollection(catalogue);
    }

    public Cake getRandomCake() {
        Cake cake=this.cakeDisplay.get(new Random().nextInt(this.cakeDisplay.size()));
        this.cakeDisplay.remove(cake);
        return cake;
    }

    public void makeOrder(Client client, ArrayList<Cake> cakes, String address) {
        Order order=new Order(client,address,cakes);
        System.out.println("Ordered accepted!");
        DeliveryGuy randomDeliveryGuy=getRandomDeliveryGuy();
        randomDeliveryGuy.addOrder(order);
        randomDeliveryGuy.deliverOrder(order);
    }

    private DeliveryGuy getRandomDeliveryGuy() {
        int randomPosition=new Random().nextInt(this.deliveryGuys.size());
        int i=0;
        for (DeliveryGuy dg:this.deliveryGuys) {
            if(i==randomPosition){
                return dg;
            }
            i++;
        }
        return null;
    }
}
