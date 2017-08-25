package ExcercisePackage.Imoti;

import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class Apartment extends Estate {
    private String type;
    private String buildType;
    private final String[] types1={"Kirpich", "Tuhla", "EPK", "Panelka"};
    private final String[] types2={ "Studio", "Garsoniera", "Dvustaen", "Tristaen", "Mezonet"};

    public Apartment(double price) {
        super(price, 100);
        this.type=types2[new Random().nextInt(types2.length)];
        this.buildType=types1[new Random().nextInt(types1.length)];
    }

    @Override
    public void printType() {
        System.out.println("Build type of the apartment: "+this.buildType);
        System.out.println("Type of the apartment: "+this.type);
        System.out.println("Price: "+this.getPrice());
    }
}
