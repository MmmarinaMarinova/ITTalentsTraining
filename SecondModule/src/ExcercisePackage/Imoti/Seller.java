package ExcercisePackage.Imoti;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Seller extends Client{
    private Estate estate;
    private double budget;

    public Seller(String name) {
        super(name);
        this.budget=0.0;
    }

    void registerEstate(Agency agency){
        if(agency!=null){
            agency.putEstateForSale(this);
            this.estate.setSeller(this);
        }
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Estate getEstate() {
        return this.estate;
    }

}
