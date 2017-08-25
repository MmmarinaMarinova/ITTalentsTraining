package Restaurant;

import org.omg.PortableServer.POAPackage.InvalidPolicy;

/**
 * Created by Marina on 17.8.2017 г..
 */
public abstract class Drink extends MenuProduct{

    public Drink(String name, double price) {
        super(20, name, price);
    }


}
