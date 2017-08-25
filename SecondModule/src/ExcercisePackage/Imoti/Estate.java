package ExcercisePackage.Imoti;

/**
 * Created by Marina on 15.8.2017 г..
 */
public abstract class Estate {
    private String description;
    private double price;
    private String address;
    private int sqrm;
    private Agent agent;
    private Seller seller;

    public Estate(double price, int size) {
        this.price = price;
        this.description="Imotche";
        this.address="Sofia";
        this.sqrm=size;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return this.seller;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Agent getAgent() {
        return this.agent;
    }

    public double getPrice() {
        return this.price;
    }



    public abstract void printType();
}
