package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Witness extends Citizen {
    public Witness(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    protected void hireLawyers() {
        System.out.println("A witness cannot have lawyers!");
    }
}
