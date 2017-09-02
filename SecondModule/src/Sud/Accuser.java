package Sud;

import java.util.HashSet;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Accuser extends Citizen implements IAccuser{

    public Accuser(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    protected void hireLawyers() {
        for (int i = 0; i < 2; i++) {
            Lawyer lawyer=new Lawyer("Lawyer"+(i+1), 10+i,20+i);
            this.lawyers.add(lawyer);
        }
    }


}
