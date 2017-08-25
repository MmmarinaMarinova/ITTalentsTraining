package ExcercisePackage.Imoti;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Buyer extends Client{
    private double budget;
    private ArrayList<Review> reviews;
    private Agent agent;

    public Buyer(String name, double budget) {
        super(name);
        this.budget = budget;
        this.reviews=new ArrayList<>();
    }

    public double getBudget() {
        return this.budget;
    }


    void searchForEstate(Agency agency){
        if(agency!=null){
            agency.findEstateForBuyer(this);
        }
     }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public void askForReview(Agency agency){
         Estate chosenEstate=this.chooseFromCatalogue(agency);
         agency.organiseReview(this,chosenEstate);
    }

     Estate chooseFromCatalogue(Agency agency) {
         //ArrayList<Estate> catalogue=agency.getCatalogue();
         Estate estate=agency.getCatalogue().get(new Random().nextInt(agency.getCatalogue().size()));
         return estate;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    void buyEstate(Agency agency){
        Estate estate=getRandomReview(agency);
        agency.sellEstate(this, estate);
    }

    private Estate getRandomReview(Agency agency) {
        if(this.reviews.size()>0){
            return this.reviews.get(new Random().nextInt(this.reviews.size())).getEstate();
        }else{
            System.out.println(this.getName()+" hasn't done any reviews! Ask for a new review!");
            askForReview(agency);
            return getRandomReview(agency);
        }
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    public boolean canBuy(Estate estate) {
        if(estate.getPrice()+0.03*estate.getPrice()<estate.getPrice()){
            return true;
        }else{
            return false;
        }
    }
}
