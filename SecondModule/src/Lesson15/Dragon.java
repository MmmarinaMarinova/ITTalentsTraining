package Lesson15;

/**
 * Created by Marina on 18.7.2017 г..
 */
public class Dragon {
    private final String name;
    private final String title;
    private final String color="Black";
    private final int damage=500;
    private int health=10_000;

    public Dragon(String name, String title) {
        this.name = name;
        this.title = title;
    }
}
