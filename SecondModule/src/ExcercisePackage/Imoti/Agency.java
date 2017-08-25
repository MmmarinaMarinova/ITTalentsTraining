package ExcercisePackage.Imoti;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Agency {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Agent> agents;
    private ArrayList<Estate> catalogue;
    private double money;

    public Agency() {
        this.name="Talents estates";
        this.address="Sofia";
        this.phone="+35945612545";
        this.money=0.0;
        this.agents=new ArrayList<>();
        this.catalogue=new ArrayList<>();
    }

    public ArrayList<Estate> getCatalogue() {
        return this.catalogue;
    }

    public ArrayList<Agent> getAgents() {
        return this.agents;
    }

    public void putEstateForSale(Seller seller) {
        if(seller!=null){
            Agent agent=this.getRandomAgent();
            Estate estate=seller.getEstate();
            estate.setAgent(agent);
            addInCatalogue(estate);
            agent.addSeller(seller);
            System.out.println(seller.getName()+ " registered estate");
            System.out.println(agent.getName()+" is their agent");
        }
    }

    private void addInCatalogue(Estate estate) {
        if(estate!=null){
            this.catalogue.add(estate);
        }
    }

    private Agent getRandomAgent() {
        return this.agents.get(new Random().nextInt(this.agents.size()));
    }

    public void findEstateForBuyer(Buyer buyer) {
        Agent a=this.getRandomAgent();
        buyer.setAgent(a);
        System.out.println("Agent "+a.getName()+" set to client "+buyer.getName());
        a.addBuyer(buyer);
    }

    public void organiseReview(Buyer buyer, Estate estate) {
            if(estate.getPrice()<buyer.getBudget()){
                Review review=new Review(estate, estate.getAgent(),buyer);
                buyer.getReviews().add(review);
                estate.getAgent().getReviews().add(review);
            }
            else{
                System.out.println(buyer.getName()+" cannot ask for review for this estate");
            }
    }

    public void sellEstate(Buyer buyer, Estate estate) {
        if(buyer!=null && estate!=null){
            if(buyer.canBuy(estate)){
                this.money+= estate.getPrice()*0.015;
                Agent agent=estate.getAgent();
                agent.setMoney(agent.getMoney()+estate.getPrice()*0.015);
                buyer.setBudget(buyer.getBudget()-estate.getPrice());
                estate.getSeller().setBudget(estate.getSeller().getBudget()+estate.getPrice());
                System.out.println(buyer.getName()+" bought an estate: ");
                System.out.println("Estate type: ");
                estate.printType();
            }
        }
    }

    void printInfo(){
        System.out.println(this.name+" has "+this.money);
    }
}
