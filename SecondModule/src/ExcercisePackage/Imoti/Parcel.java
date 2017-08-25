package ExcercisePackage.Imoti;

import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Parcel extends Estate {
    private boolean isRegulated;

    public Parcel(double price) {
        super(price, 500);
        this.isRegulated=new Random().nextBoolean();
    }

    @Override
    public void printType() {
        System.out.println("Type: parcel");
        System.out.println("Is it regulated: "+this.isRegulated);
        System.out.println("Price: "+this.getPrice());
    }
}
