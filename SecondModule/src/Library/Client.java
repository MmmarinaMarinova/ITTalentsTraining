package Library;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Client {
    private String name;
    private double money;
    private HashMap<String, ReadingMaterial> readingsTaken;

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
        this.readingsTaken=new HashMap<String, ReadingMaterial>();
    }

    void askForReadingMaterialForHome(Library library, ReadingMaterial readingMaterial){
        readingMaterial.lendReadingForHome(this);
    }
    public double getMoney() {
        return this.money;
    }

    protected void payForReadingMaterial(double lendingPrice) {
        this.money-=lendingPrice;
        System.out.println(this.name+" paid for a reading material");
    }


    public String getName() {
        return this.name;
    }

    public void putReadingInCarton(ReadingMaterial readingMaterial) {
        this.readingsTaken.put(readingMaterial.getName(),readingMaterial);
        System.out.println(readingMaterial.getName()+" was added to carton of: "+this.getName());
    }

    void returnAReading(Library library,String readingName){
        if(this.readingsTaken.containsKey(readingName)){
            library.returnReading(this.readingsTaken.get(readingName), this);
        }
    }
}
