package Library;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;


/**
 * Created by Marina on 3.9.2017 г..
 */
public abstract class ReadingMaterial {
    private String name;
    private LocalDate printDate;
    private String publisher;
    private ArrayDeque<Lend> history;
    private ReadingMaterialType type;
    private int allowedDaysToLend;
    private double lendingPrice;
    protected boolean isCurrentlyInLibrary;
    private double tax;

    public ReadingMaterial(String name, LocalDate printDate, String publisher,int allowedDaysToLend, double lendingPrice) {
        this.name = name;
        this.printDate = printDate;
        this.publisher = publisher;
        this.history=new ArrayDeque<>();
        this.type=getReadingMaterialType();
        this.lendingPrice=lendingPrice;
        this.allowedDaysToLend=allowedDaysToLend;
        this.isCurrentlyInLibrary=true;
        this.tax=0;
    }

    protected abstract ReadingMaterialType getReadingMaterialType();

    protected void lendReadingForHome(Client client){
            if(this.isCurrentlyInLibrary){
                if(client.getMoney()>=this.getLendingPrice()){
                    Lend lend=new Lend();
                    this.addLendInHistory(lend);
                    this.isCurrentlyInLibrary=false;
                    client.payForReadingMaterial(this.getLendingPrice());
                    System.out.println(client.getName()+" got a reading material");
                    client.putReadingInCarton(this);
                }else{
                    System.out.println(client.getName()+" does not have enough money!");
                }
            }else{
                System.out.println("The reading material is already borrowed!");
            }
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getPrintDate() {
        return this.printDate;
    }

    @Override
    public String toString() {
        return "ReadingMaterial{" +
                "name='" + name + '\'' +
                ", printDate=" + printDate +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public double getLendingPrice() {
        return this.lendingPrice;
    }

    public int getAllowedDaysToLend() {
        return this.allowedDaysToLend;
    }

    public Collection getHistory() {
        return Collections.unmodifiableCollection(this.history);
    }

    protected void addLendInHistory(Lend lend){
        this.history.push(lend);
        System.out.println("New lend added in history of "+this.name);
    }

    public  boolean isExtended(){
        if(!this.history.peek().isReturned()){
            if(LocalDate.now().isAfter(this.history.peek().getLendDate().plusDays(this.allowedDaysToLend))){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public void addTax(int i) {
        this.tax+=i;
    }

    public void setReturnDate() {
        this.history.getLast().setLendDate(LocalDate.now());
        this.history.getLast().setReturned(true);
    }

    public double getTax() {
        return this.tax;
    }
}
