package Shop;


import java.util.Random;

/**
 * Created by Marina on 20.8.2017 г..
 */
public class PieceProduct extends Product {
    private int quantity;

    public PieceProduct(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public Product flyToCart(Shop shop,int desiredQuantity) {
        this.quantity-=desiredQuantity;
        Product product=new WeightProduct(this.getName(),desiredQuantity);
        if(this.quantity==0){
            shop.removeProductFromShop(this);
            shop.setCurrentFreeSpace(shop.getCurrentFreeSpace()+1);
        }
        return product;
    }

    @Override
    public boolean isPieceProduct() {
        return true;
    }

    @Override
    public boolean isWeightProduct() {
        return false;
    }
}
