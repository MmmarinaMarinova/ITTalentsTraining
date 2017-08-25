package Shop;

/**
 * Created by Marina on 20.8.2017 г..
 */
public class WeightProduct extends Product {
    private double quantity;

    public WeightProduct(String name, double quantity) {
        super(name);
        this.quantity = quantity;
    }

    @Override
    public Product flyToCart(Shop shop,int desiredQuantity) {
        System.out.println(this.getName()+" This product cannot be sold by piece");
        return null;
    }

    @Override
    public boolean isPieceProduct() {
        return false;
    }

    @Override
    public boolean isWeightProduct() {
        return true;
    }
}
