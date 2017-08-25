package Lesson15;

/**
 * Created by Marina on 20.7.2017 г..
 */
public class Weapon {
    protected final String name;
    protected final int damage;
    protected final static int MAX_DURABILITY=100;
    protected int durability=MAX_DURABILITY;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }

    public int getDurability() {
        return this.durability;
    }

    public void crack() {
        this.durability--;
    }

    public void repair() {
        this.durability=MAX_DURABILITY;
    }
}
