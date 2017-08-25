package Lesson15;

import java.util.Random;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class Woods {
    private final String name;
    private Creep[] creeps;
    private Dragon dragon;

    public Woods(String name, int creeps) {
        this.name = name;
        this.creeps=new Creep[creeps];
        for (int i = 0; i < this.creeps.length; i++) {
            this.creeps[i]=new Creep("Gadina"+(i+1));
        }

        this.dragon=new Dragon("Spaska","Gladnata");
    }

    public Creep getRandomCreep(){
        Random random=new Random();
        Creep c=this.creeps[random.nextInt(this.creeps.length)];
        System.out.println("A wild creep appears!");
        System.out.println("Damage: "+c.getDamage());
        System.out.println("Health: "+c.getHealth());
        return c;
    }
}
