package Shop;

import java.util.Random;

/**
 * Created by Marina on 20.8.2017 г..
 */
public abstract class Product {
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
        this.price = new Random().nextDouble()*10+1;
    }

    public String getName() {
        return this.name;
    }


    public abstract boolean isPieceProduct();


    public abstract boolean isWeightProduct();

    public abstract Product flyToCart(Shop shop,int desiredQuantity);
}
