package Lesson15;

import java.util.Random;

/**
 * Created by Marina on 18.7.2017 г..
 */
public class Creep {
    private final String name;
    private final int damage;
    private int health;

    public Creep(String name) {
        this.name = name;
        this.damage=new Random().nextInt(10)+5;
        this.health=new Random().nextInt(150)+50;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void die(Hero hero){
            Weapon droppedWeapon=this.dropWeapon();
            if(!hero.hasBetterWeapon(droppedWeapon)){
                hero.lootWeapon(droppedWeapon);
            }

    }
    public Weapon dropWeapon(){
        if(new Random().nextBoolean()){
            return new Sword("Epichniqt mech na Ivelin",new Random().nextInt(120)+30);
        }else{
            return new Axe("Qkata bradva na Marina", new Random().nextInt(200)+30);
        }
    }
    public void hit(Hero enemy) {
        enemy.setHealth(enemy.getHealth()-this.damage);
    }
}
