package Lesson15;


/**
 * Created by Marina on 18.7.2017 г..
 */
public class Hero {
    private final String name;
    private int health=200;
    private int damage=10;
    private Sword sword;
    private Axe axe;
    private Weapon weapon;

    public Hero(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return this.health;
    }
    public void lootWeapon(Weapon droppedWeapon ) {
        this.weapon=droppedWeapon;
    }

    public boolean hasBetterWeapon(Weapon droppedWeapon) {
        if(this.weapon==null){
            return false;
        }
        return this.weapon.getDamage()>droppedWeapon.getDamage();
    }

    private void hit(Creep enemy){
        int totalDamage=this.damage;
        if(this.weapon!=null && weapon.getDurability()>0){
            totalDamage+=this.weapon.getDamage();
            weapon.crack();
        }
        enemy.setHealth(enemy.getHealth()-totalDamage);
    }


    public void fightCreep(Creep enemy){
        System.out.println("FIGHT!");
        while(true){
            if(enemy.getHealth()<=0){
                enemy.die(this);
                System.out.println("VICTORY!");
                break;
            }
            if(this.health<=0){
                this.health=1;
                System.out.println("RETREAT!");
                break;
            }
            this.hit(enemy);
            enemy.hit(this);
        }
    }

    public boolean isCriticallyInjured(){
        return this.health==1;
    }

    public void rest(){
        this.health=200;
        if(this.weapon!=null){
            this.weapon.repair();
        }
    }

    public void printInfo(){
        int totalDamage=this.damage;
        if(this.weapon!=null && weapon.getDurability()>0){
            totalDamage+=this.weapon.getDamage();
        }

        System.out.println("--------HERO-------");
        System.out.println("Health: "+this.health);
        System.out.println("Weapon: "+ (this.weapon==null ? "none":(weapon.getClass().getSimpleName()+" - "+weapon.getName()+" - "+weapon.getDamage()+" - "+weapon.getDurability())));
        System.out.println("Damage: "+totalDamage);
        System.out.println("-------------------");
    }
}
