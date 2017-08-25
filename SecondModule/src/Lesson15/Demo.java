package Lesson15;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        Hero mincho=new Hero("Mincho" );
        Woods goriTilileiski=new Woods("Tililei",600);
        System.out.println("Welcome to Tililei");

        for (int i = 0; i < 100; i++) {
            mincho.printInfo();
            mincho.fightCreep(goriTilileiski.getRandomCreep());
            mincho.printInfo();
            mincho.fightCreep(goriTilileiski.getRandomCreep());
            mincho.printInfo();
            mincho.rest();
        }

    }
}
