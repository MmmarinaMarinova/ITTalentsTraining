package ExcercisePackage.Imoti;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        //tochka 1
        Agency agency=new Agency();
        for (int i = 0; i < 5; i++) {
            Agent agent=new Agent("Agent "+i);
            agency.getAgents().add(agent);
        }

        //tochka 2 i 3
        ArrayList<Seller> sellers=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Seller seller=new Seller("Seller "+i);
            Estate estate=generateEstate();
            seller.setEstate(estate);
            estate.setSeller(seller);
            seller.registerEstate(agency);
            sellers.add(seller);
        }

        //tochka 4 i 5
        ArrayList<Buyer> buyers=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Buyer buyer=new Buyer("Buyer "+i, new Random().nextInt(120000)+200000);
            buyers.add(buyer);
            buyer.searchForEstate(agency);
        }

        //tochka 6
        for (int i = 0; i < buyers.size(); i++) {
            for (int j = 0; j < 3; j++) {
                buyers.get(i).askForReview(agency);
            }
        }

        //tochka 7
        for (int i = 0; i < buyers.size(); i++) {
            buyers.get(i).buyEstate(agency);
        }

        //tochka 8
        agency.printInfo();

        //tochka 9
        for (Agent a: agency.getAgents()) {
            a.printInfo();
        }
    }

     static Estate generateEstate() {
         Random random=new Random();
         int type=random.nextInt(3);
         Estate estate;
         double price=0.0;
         switch (type){
             case 0: {
                 price=random.nextInt(80000)+70000;
                 estate=new Apartment(price);
                 break;
             }
             case 1: {
                 price=random.nextInt(30000)+50000;
                 estate=new House(price);
                 break;
             }
             case 2: {
                 price=random.nextInt(55000)+30000;
                 estate=new Parcel(price);
                 break;
             }
             default:{
                 price=100000;
                 estate=new Apartment(price);
             }
         }
         return estate;
    }
}
