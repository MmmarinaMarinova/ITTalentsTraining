package Sud;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Marina on 2.9.2017 г..
 */
public abstract class Citizen {
    private String name;
    private String address;
    private int age;
    protected HashSet<Lawyer> lawyers;

    public Citizen(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        lawyers=new HashSet<>();
    }

    protected abstract void hireLawyers();

    public HashSet<Lawyer> getLawyers() {
        return this.lawyers;
    }
}
