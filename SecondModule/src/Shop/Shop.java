package Shop;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 20.8.2017 г..
 */
public class Shop {
    private String name;
    private String address;
    private double money;
    private ArrayList<Product> products;
    private int capacity;
    private int currentFreeSpace;

    public Shop() {
        this.name="LIDL";
        this.address="Sofia";
        this.money=1000;
        this.products=new ArrayList<Product>();
        this.capacity=30;
        this.currentFreeSpace=30;
        addProductsInShop();
    }


    private void addProductsInShop(){
        WeightProduct meat=new WeightProduct("Meso",10.0);
        WeightProduct cheese=new WeightProduct("sirene",15);
        WeightProduct fish=new WeightProduct("riba",20);
        PieceProduct beer=new PieceProduct("Bira",24);
        PieceProduct book=new PieceProduct("Book",50);
        PieceProduct chair=new PieceProduct("Stol",10);
        products.add(meat);
        products.add(cheese);
        products.add(chair);
        products.add(fish);
        products.add(beer);
        products.add(book);
        System.out.println("Added products to shop.");
        this.currentFreeSpace-=6;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrentFreeSpace() {
        return this.currentFreeSpace;
    }

    public Product getRandomProduct() {
        return this.products.get(new Random().nextInt(this.products.size()));
    }

    public void removeProductFromShop(PieceProduct pieceProduct) {
        this.products.remove(pieceProduct);
    }

    public void setCurrentFreeSpace(int currentFreeSpace) {
        this.currentFreeSpace = currentFreeSpace;
    }
}
