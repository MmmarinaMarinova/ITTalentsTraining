package Shop;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 20.8.2017 г..
 */
public class Client {
    private String name;
    private double money;
    private int maxCount;
    private Shop shop;
    private ArrayList<Product> cart;

    public Client(String name) {
        this.name = name;
        this.money = new Random().nextDouble()*100;
        this.maxCount = 10;
        this.cart = new ArrayList<>();
    }

    void addToCartinPiece(){
        Product randomProduct;
        do {
             randomProduct = this.shop.getRandomProduct();
        }while(!randomProduct.isPieceProduct());
        int desiredQuantity=0;
        int availableQuantity=((PieceProduct)randomProduct).getQuantity();
        desiredQuantity=new Random().nextInt();
        Product product=randomProduct.flyToCart(this.shop,desiredQuantity);
        this.cart.add(product);
    }

    void removeFromCartInPiece(){
        Product randomProduct;
        do{
            randomProduct=this.cart.get(new Random().nextInt(this.cart.size()));
        }while(!randomProduct.isPieceProduct());
        //todo


    }
}
