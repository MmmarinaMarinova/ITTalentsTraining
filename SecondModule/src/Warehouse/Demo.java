package Warehouse;

import Restaurant.*;

/**
 * Created by Marina on 25.8.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        Shop shop=new Shop("Kaufland",3000);
        Warehouse warehouse=new Warehouse("Skladche");
        Client client=new Client("Clientche",200);
        shop.printInfo();
        warehouse.printInfo();
        System.out.println("-------------------------------------");

        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);
        client.buyRandomProduct(shop);

        shop.increaseProductAvailability("banana",20);
        shop.increaseProductAvailability("pork",35);
        shop.printInfo();
        warehouse.orderProducts("cucumber",20,shop);
        warehouse.printInfo();
        shop.printInfo();
        client.printInfo();

    }
}
