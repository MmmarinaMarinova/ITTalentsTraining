package Lesson13.MortalCombat;

import java.util.Random;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class Fighter {
    private String name;
    private int health;
    private int damage;
    private Fighter enemy;
    private boolean isDead;

    public Fighter() {

    }

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if(health>500){
            System.out.println("Invalid health!");
            return;
        }
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        if(damage<=0){
            System.out.println("Invalid damage!");
            return;
        }
        this.damage = damage;
    }

    public Fighter getEnemy() {
        return this.enemy;
    }

    public void setEnemy(Fighter enemy) {
        this.enemy = enemy;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    void hit(){
        Random random=new Random();
        int luck=random.nextInt(100)+1;
        int newHealth=enemy.getHealth();

        if(luck<=70){
            newHealth-=(int)(0.6*damage);
            enemy.setHealth(newHealth);
            System.out.println(name+" hit with "+0.6*damage+" damage!");
        }

        if(luck>70 && luck<=95){
            newHealth-=damage;
            enemy.setHealth(newHealth);
            System.out.println(name+" hit with "+damage+" damage!");
        }

        if(luck>95){
            newHealth-=2*damage;
            enemy.setHealth(newHealth);
            System.out.println(name+" hit with "+2*damage+" damage!");
        }
        if(health<=0){
            System.out.println(name+" is dead!");
            isDead=true;
            System.out.println("The winner is: "+enemy.getName());
            return;
        }else{
            System.out.println(name+" has left with "+health+" health.");
        }

        if(enemy.getHealth()<=0){
            System.out.println(enemy.getName()+" is dead!");
            enemy.setDead(true);
            System.out.println("The winner is: "+name);
            return;
        }else{
            System.out.println(enemy.getName()+" has left with "+enemy.getHealth()+" health");
        }

        System.out.println("************************************");
    }
}
