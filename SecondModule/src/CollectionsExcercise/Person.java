package CollectionsExcercise;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by Marina on 24.8.2017 г..
 */
public class Person {
    public String name;
    public String address;
    public int age;
    public static int idNum=1;
    public int id;
    public int height;
    public int money;
    public int weight;

    public Person() {
        this.name = "Peshkata";
        this.address = "Sofia";
        this.age = new Random().nextInt(100)+1;
        this.id=idNum++;
        this.height = 155;
        this.money = 500;
        this.weight = 80;
    }

    public Person(String name, String address, int age, int height, int money, int weight) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.height = height;
        this.money = money;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", id=" + id +
                ", money=" + money +
                ", weight=" + weight +
                '}';
    }



    /*@Override
    public int compareTo(Object o) {
        Person person=((Person)o);
        if(this.hashCode()==person.hashCode()){
            return 0;
        }else{
            return this.hashCode()<person.hashCode()? -1:1;
        }
    }*/
}
