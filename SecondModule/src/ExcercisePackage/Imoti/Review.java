package ExcercisePackage.Imoti;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Review {
    private Estate estate;
    private Agent agent;
    private Buyer potentialBuyer;
    private String date;

    public Review(Estate estate, Agent agent, Buyer potentialBuyer) {
        this.estate = estate;
        this.agent = agent;
        this.potentialBuyer = potentialBuyer;
        this.date="01.01.2017";
    }

    public Estate getEstate() {
        return this.estate;
    }
}
