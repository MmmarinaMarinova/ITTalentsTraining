package Restaurant;

/**
 * Created by Marina on 18.8.2017 г..
 */
public abstract class MenuProduct {
    private int availability;
    private String name;
    private double price;

    public MenuProduct(int availability, String name, double price) {
        this.availability = availability;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }


    public int getAvailability() {
        return this.availability;
    }

    public String getName() {
        return this.name;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        StringBuilder strb=new StringBuilder();
        strb.append("Product: "+this.name+"\n");
        strb.append("Price: "+this.price+"\n");
        return strb.toString();
    }

    abstract boolean isMutraProduct();
    abstract boolean isVeganProduct();

    public void showAvailable(){
        System.out.println(this.name+" : "+this.availability+" portions\n");
    }
}
