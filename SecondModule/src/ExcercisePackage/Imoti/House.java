package ExcercisePackage.Imoti;

import java.util.Random;

/**
 * Created by Marina on 15.8.2017 г..
 */
public class House extends Estate {
    private String type;
    private String buildType;
    private int parkSpaces;
    private int sizeOfYard;
    private final String[] types={"Kirpich", "Tuhla", "EPK", "Panelka"};


    public House(double price) {
        super(price, 200);
        Random random=new Random();
        this.type=random.nextBoolean()? "Floor": "Whole house";
        this.buildType=types[random.nextInt(types.length)];
        this.parkSpaces=random.nextInt(5)+1;
        this.sizeOfYard=random.nextInt(50)+1;
    }

    @Override
    public void printType() {
        System.out.println("Build type of the house: "+this.buildType);
        System.out.println("Type of the house: "+this.type);
        System.out.println("Price: "+this.getPrice());
    }
}
